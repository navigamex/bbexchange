package com.bbexchange.user.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bbexchange.common.constance.enums.UserErrorEnum;
import com.bbexchange.common.mapper.UserMapper;
import com.bbexchange.common.entity.UserEntity;
import com.bbexchange.common.exception.BusinessException;
import com.bbexchange.common.service.BaseService;
import com.bbexchange.user.dto.LoginDTO;
import com.bbexchange.user.service.UserService;
import com.bbexchange.user.vo.LoginVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl extends BaseService implements UserService {
    @Resource
    UserMapper userMapper;


    @Override
    public LoginVO login(LoginDTO loginDTO) {

        //查库
        UserEntity userEntity = userMapper.selectOne(new LambdaQueryWrapper<UserEntity>()
                .eq(UserEntity::getUsername, loginDTO.getUsername()));
        //检查用户
        if (userEntity == null) {
            this.error(UserErrorEnum.USER_NOT_EXIST);
        }
        //检查密码 sha256
        //拿到用户的密码,进行sha256(super md5)) ,, 再与盐混合,二次sha256
        String passMd5 = DigestUtils.sha256Hex(loginDTO.getPassword().getBytes());
        passMd5 =  DigestUtils.sha256Hex(userEntity.getSalt() + passMd5);

        if (!userEntity.getPassword().equals(passMd5)) {
            log.warn("用户密码错误, 传来的密码是{}, md5后是{}, 库中是{}, "
                    , loginDTO.getPassword(), passMd5, userEntity.getPassword());
            this.error(UserErrorEnum.USER_PASSWORD_ERROR);

        }
        //登录成功, 生成token
        StpUtil.login(userEntity.getId());
        return LoginVO.builder()
                .token(StpUtil.getTokenInfo().getTokenValue())
                .build();
    }
}
