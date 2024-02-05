package com.lujiaxin.coke.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionScript {

    @TableId(value = "as_id",type = IdType.AUTO)
    private long asId;

    private String asType;

    private String asComponent;

    private Long asIndex;

    private Long asActionId;

    private Long asMasterId;

    private String asAudoUrl;

    private Integer asPriority;

    private String asDetectRule;

    private Long asRuleId;

    private Integer asActionPriority;

}
