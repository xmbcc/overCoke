package com.lujiaxin.coke.service.nodes.impl;

import com.lujiaxin.coke.config.domain.ContextParam;
import com.lujiaxin.coke.service.nodes.BussinessProcess;
import com.lujiaxin.coke.domain.UserInfo;
import com.lujiaxin.coke.exception.BussinessException;
import com.lujiaxin.coke.utils.userInfo.ParseUserInfo;
import lombok.AllArgsConstructor;

/**
 * 身份权限 token 解析校验
 * @author lujiaxin
 * @date 2024/1/31
 */
@AllArgsConstructor
public class AuthTokenProcess implements BussinessProcess {

    private static final Integer status = 5;

    private ParseUserInfo parseUserInfo;

    @Override
    public void doProcess(ContextParam param) {
        String token = param.getToken();

        UserInfo userInfo = parseUserInfo.parse(token);

        // 1 校验用户信息是否存在
        if(null == userInfo || userInfo.getId() <= 0){
            throw new BussinessException("userInfo 为空",10001);
        }

        // TODO: 2024/1/31 判断用户权限标志以及特殊标志

        param.setUserInfo(userInfo);

        param.getStatusLog().setStatus(status);


    }
}
