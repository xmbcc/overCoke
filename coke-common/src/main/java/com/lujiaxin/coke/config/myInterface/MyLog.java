package com.lujiaxin.coke.config.myInterface;

import java.lang.annotation.*;

/**
 * 自定义打印日志注解
 * @author lujiaxin
 * @date 2024/2/5
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
}
