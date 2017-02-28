package com.wangj.gold.http;

/**
 * 当前类注释：自定义异常
 * Author :LeonWang
 * Created  2017/2/28.15:22
 * Description:
 * E-mail:lijiawangjun@gmail.com
 */

public class ApiException extends RuntimeException{

    public final int code;
    public final String message;

    public ApiException(int code) {
        this(code,null);
    }

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
