package com.lujiaxin.coke.exception;

/**
 * 业务异常类
 * @author lujiaxin
 * @date 2024/1/31
 */
public class BussinessException extends RuntimeException{

    private String msg;
    private Integer code;
    private Object data;

    public BussinessException(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public BussinessException(String msg) {
        this.msg = msg;
    }

    public BussinessException(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
}
