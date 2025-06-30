package com.bbexchange.common.response;

import com.bbexchange.common.constance.enums.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Response<T> {
    private int code;
    private String msg;
    private T data;
    public static  <T>Response<T> success(T data) {
        Response<T> response = new Response<>();
        response.setData(data);
        response.setCode(0);
        response.setMsg("success");
        return response;
    }
    public static  <T>Response<T> success() {
        Response<T> response = new Response<>();
        response.setData(null);
        response.setCode(0);
        response.setMsg("success");
        return response;
    }
    public static  <T>Response<T> success(T data,int code, String msg) {
        Response<T> response = new Response<>();
        response.setData(null);
        response.setCode(0);
        response.setMsg(msg);
        return response;
    }

    public static  <T>Response<T> error(int code, String msg) {
        Response<T> response = new Response<>();
        response.setData(null);
        response.setCode(code);
        response.setMsg(msg);
        return response;
    }

    public static  <T>Response<T> error( String msg) {
        Response<T> response = new Response<>();
        response.setData(null);
        response.setCode(-1);
        response.setMsg(msg);
        return response;
    }
    public static  <T>Response<T> error(int code) {
        Response<T> response = new Response<>();
        response.setData(null);
        response.setCode(code);
        response.setMsg("");
        return response;
    }
    public static  <T>Response<T> error(BaseEnum baseEnum) {
        Response<T> response = new Response<>();
        response.setData(null);
        response.setCode(baseEnum.getCode());
        response.setMsg(baseEnum.getMsg());
        return response;
    }

}
