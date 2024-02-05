package com.lujiaxin.coke.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
/**
 * 动作规则打分
 * @author lujiaxin
 * @date 2024/1/24
 */
public class ActionRuleScore {

    @TableId(value = "asr_id",type = IdType.AUTO)
    private long asrId;

    //优秀、良好对应语音
    private Long asrScriptId;

    private Long asrIndex;

    //打分规则
    private String asrRule;

    //分值
    private Integer asrWeight;

}
