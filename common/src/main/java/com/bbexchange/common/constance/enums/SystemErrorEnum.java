package com.bbexchange.common.constance.enums;

import lombok.Getter;

public enum SystemErrorEnum implements BaseEnum {

    SYSTEM_ERROR_1(1, "系统繁忙,请稍后再试!"),



    USER_NOT_LOGIN_OUT(-1, "占位");
    @Getter
    final    int code;

    @Getter
    final    String msg;
    SystemErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
