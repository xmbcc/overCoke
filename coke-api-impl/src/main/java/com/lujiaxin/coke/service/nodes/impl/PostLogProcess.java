package com.lujiaxin.coke.service.nodes.impl;

import com.lujiaxin.coke.config.domain.ContextParam;
import com.lujiaxin.coke.service.nodes.BussinessProcess;


/**
 * 后置结束处理
 * @author lujiaxin
 * @date 2024/1/31
 */
public class PostLogProcess implements BussinessProcess {

    private static final Integer status = 100;

    @Override
    public void doProcess(ContextParam param) {

        param.getStatusLog().setStatus(status);


    }
}
