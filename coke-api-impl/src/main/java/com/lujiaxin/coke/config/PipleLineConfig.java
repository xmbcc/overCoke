package com.lujiaxin.coke.config;

import com.lujiaxin.coke.service.nodes.PipleLineTemplate;
import com.lujiaxin.coke.service.nodes.impl.ActionVerifyProcess;
import com.lujiaxin.coke.service.nodes.impl.AuthTokenProcess;
import com.lujiaxin.coke.service.nodes.impl.PostLogProcess;
import com.lujiaxin.coke.service.nodes.impl.PreLogProcess;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * 初始化注入责任链
 * @author lujiaxin
 * @date 2024/1/31
 */
@Configuration
@AllArgsConstructor
public class PipleLineConfig {

    private PreLogProcess preLogProcess;

    private AuthTokenProcess authTokenProcess;

    private ActionVerifyProcess actionVerifyProcess;

    private PostLogProcess postLogProcess;

    @Bean
    public PipleLineTemplate initConfig(){
        PipleLineTemplate t = new PipleLineTemplate();
        t.setLines(Arrays.asList(preLogProcess,authTokenProcess,actionVerifyProcess,postLogProcess));
        return t;
    }

}
