package com.lujiaxin.coke.service.nodes;

import com.lujiaxin.coke.config.domain.ContextParam;

/**
 * 责任链父接口
 * @author lujiaxin
 * @date 2024/1/31
 */
public interface BussinessProcess {

    void doProcess(ContextParam param);

}
