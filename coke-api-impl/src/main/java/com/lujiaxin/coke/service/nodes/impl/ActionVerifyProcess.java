package com.lujiaxin.coke.service.nodes.impl;

import com.lujiaxin.coke.config.myInterface.MyLog;
import com.lujiaxin.coke.config.domain.ContextParam;
import com.lujiaxin.coke.service.nodes.BussinessProcess;
import com.lujiaxin.coke.domain.vo.ActionAllVo;

/**
 * 动作相关规则语音判断器安全校验
 * @author lujiaxin
 * @date 2024/1/31
 */
public class ActionVerifyProcess implements BussinessProcess {

    private static final Integer status = 7;

    @Override
    @MyLog
    public void doProcess(ContextParam param) {

        ActionAllVo actionAllVo = param.getActionAllVo();

        // TODO: 2024/1/31 对动作相关信息进行校验


        if(true){
            param.setCheckOut(true);
        }

        param.getStatusLog().setStatus(status);

    }
}
