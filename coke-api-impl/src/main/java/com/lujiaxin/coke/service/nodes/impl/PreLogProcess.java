package com.lujiaxin.coke.service.nodes.impl;

import com.lujiaxin.coke.config.domain.ContextParam;
import com.lujiaxin.coke.service.nodes.BussinessProcess;

/**
 * 前置任务记录数据库
 * @author lujiaxin
 * @date 2024/1/31
 */
public class PreLogProcess implements BussinessProcess {

    private static final Integer status = 3;

    @Override
    public void doProcess(ContextParam param) {


        param.getStatusLog().setStatus(status);


    }
}
