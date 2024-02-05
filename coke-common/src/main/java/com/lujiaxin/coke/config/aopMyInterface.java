package com.lujiaxin.coke.config;

import com.alibaba.fastjson.JSON;
import com.lujiaxin.coke.entity.AopLog;
import com.sun.deploy.net.HttpRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class aopMyInterface {

    @Autowired
    private HttpServletRequest request;

    @Pointcut("@within(com.lujiaxin.coke.config.myInterface.MyLog) || @annotation(com.lujiaxin.coke.config.myInterface.MyLog)")
    public void executeService(){

    }

    @Before("executeService()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        this.printRequestLog(signature,joinPoint.getArgs());
    }

    /**
     * 打印日志
     * @param signature
     * @param args
     */
    private void printRequestLog(MethodSignature signature,Object[] args) {
        AopLog aopLog = new AopLog();
        aopLog.setUrl(request.getRequestURI());
        aopLog.setMethod(request.getMethod());
        aopLog.setPath(signature.getDeclaringTypeName() + "." + signature.getMethod().getName());
        aopLog.setProduct("over-Coke");
        aopLog.setReferer(request.getHeader("referer"));
        aopLog.setRemoteAddr(request.getRemoteAddr());

        ArrayList<Object> list = new ArrayList<>();
        Arrays.stream(args).forEach(e -> {
            if(e instanceof MultipartFile || e instanceof  HttpServletRequest || e instanceof HttpServletResponse || e instanceof BindingResult){
                return ;
            }
            list.add(e);
        });

        aopLog.setArgs(list.toArray());
        log.info(JSON.toJSONString(aopLog));


    }

}
