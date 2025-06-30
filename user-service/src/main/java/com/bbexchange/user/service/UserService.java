package com.bbexchange.user.service;

import com.bbexchange.user.dto.LoginDTO;
import com.bbexchange.user.vo.LoginVO;

public interface UserService {

    LoginVO login(LoginDTO loginDTO);
}
