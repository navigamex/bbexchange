package com.bbexchange.common.constance.enums;

import lombok.Getter;

public enum UserErrorEnum  implements BaseEnum {

    USER_NOT_EXIST(10001, "用户不存在!"),
    USER_PASSWORD_ERROR(10002, "用户密码错误"),
    USER_EXIST(10003, "用户已存在"),
    USER_NOT_LOGIN(10004, "用户未登录"),
    USER_NOT_PERMISSION(10005, "用户无权限"),
    USER_NOT_ROLE(10006, "用户未分配角色"),
    USER_NOT_LOGOUT(10007, "用户未登出"),





    USER_NOT_LOGIN_OUT(-1, "占位");
    @Getter
    final    int code;

    @Getter
    final    String msg;
    UserErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
