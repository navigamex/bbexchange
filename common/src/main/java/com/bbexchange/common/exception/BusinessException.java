package com.bbexchange.common.exception;

import com.bbexchange.common.constance.enums.BaseEnum;
import com.bbexchange.common.constance.enums.UserErrorEnum;
import lombok.Getter;

public class BusinessException extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    private String msg;
    private int code = 500;
    @Getter
    private  BaseEnum baseEnum;
    public BusinessException(String msg)
    {
        super(msg);
        this.msg = msg;
    }
    public BusinessException(BaseEnum baseEnum )
    {
        super(baseEnum.getMsg());
        this.baseEnum = baseEnum;
        this.msg = baseEnum.getMsg();
        this.code = baseEnum.getCode();
    }
}
