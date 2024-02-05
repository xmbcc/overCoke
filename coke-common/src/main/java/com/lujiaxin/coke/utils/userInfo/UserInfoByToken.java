package com.lujiaxin.coke.utils.userInfo;

import com.lujiaxin.coke.domain.UserInfo;
import com.lujiaxin.coke.utils.JwtUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class UserInfoByToken implements ParseUserInfo{
    @Override
    /**
     * 无状态解析 token
     * @param token
     */
    public UserInfo parse(String token) {


        // TODO: 2024/1/31 解析 token
        UserInfo userInfo = new UserInfo();

        if(null == userInfo){
            return null;
        }

        return userInfo;
    }
}
