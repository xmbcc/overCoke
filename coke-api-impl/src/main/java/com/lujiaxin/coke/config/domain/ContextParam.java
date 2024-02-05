package com.lujiaxin.coke.config.domain;

import com.lujiaxin.coke.domain.UserInfo;
import com.lujiaxin.coke.domain.vo.ActionAllVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 责任链上下文
 * @author lujiaxin
 * @date 2024/1/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContextParam {

    private String token;
    private UserInfo userInfo;
    private ActionAllVo actionAllVo;
    private Boolean checkOut;
    private LogKeepStatus statusLog;
}
