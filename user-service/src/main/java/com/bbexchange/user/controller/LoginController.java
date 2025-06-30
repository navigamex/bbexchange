package com.bbexchange.user.controller;

import com.bbexchange.common.controller.BaseController;
import com.bbexchange.user.dto.LoginDTO;
import com.bbexchange.user.service.UserService;
import com.bbexchange.user.vo.LoginVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")

public class LoginController extends BaseController {


    @Resource
    UserService userService;
    @PostMapping("/login")
    public LoginVO login(@RequestBody LoginDTO loginDTO)
    {

        return userService.login(loginDTO);
    }
}
