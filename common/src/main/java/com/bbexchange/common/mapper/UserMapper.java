package com.bbexchange.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bbexchange.common.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  extends BaseMapper<UserEntity> {
}
