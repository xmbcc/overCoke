package com.lujiaxin.coke.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * AOP注解打印日志类
 * @author lujiaxin
 * @date 2024/2/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AopLog {

    private String url;
    private String method;
    private Object[] args;
    private String product;
    private String path;
    private String referer;
    private String remoteAddr;
    private String userAgent;

}
