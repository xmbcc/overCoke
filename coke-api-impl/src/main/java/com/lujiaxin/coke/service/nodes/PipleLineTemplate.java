package com.lujiaxin.coke.service.nodes;

import com.lujiaxin.coke.service.nodes.BussinessProcess;
import lombok.Data;

import java.util.List;

/**
 * 责任链模板类
 * @author lujiaxin
 * @date 2024/2/1
 */
@Data
public class PipleLineTemplate {

    private List<BussinessProcess> lines;

}
