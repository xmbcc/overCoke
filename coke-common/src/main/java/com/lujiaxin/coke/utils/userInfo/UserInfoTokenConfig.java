package com.lujiaxin.coke.utils.userInfo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 检测配置信息自动注入策略
 * @author lujiaxin
 * @date 2024/1/31
 */
@Configuration
@ConditionalOnProperty(prefix = "cn.get.userInfo",havingValue = "token")
public class UserInfoTokenConfig {

    @Bean
    public ParseUserInfo registerBean(){
        return new UserInfoByToken();
    }

}
