package com.lujiaxin.coke.utils.userInfo;

import com.lujiaxin.coke.domain.UserInfo;
import com.lujiaxin.coke.utils.JwtUtils;

public class UserInfoByRedis implements ParseUserInfo{
    @Override
    /**
     * 有状态解析 token
     * @param token
     */
    public UserInfo parse(String token) {

        // TODO: 2024/1/31 解析 token 出 userId 去 redis查找
        UserInfo userInfo = new UserInfo();

        if(null == userInfo){
            return null;
        }

        return userInfo;
    }
}
