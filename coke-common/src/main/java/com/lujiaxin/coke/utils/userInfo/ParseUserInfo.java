package com.lujiaxin.coke.utils.userInfo;

import com.lujiaxin.coke.domain.UserInfo;

public interface ParseUserInfo {

    UserInfo parse(String token);

}
