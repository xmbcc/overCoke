package com.lujiaxin.coke.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActionRule {

    @TableId(value = "ar_id",type = IdType.AUTO)
    private long arId;

    private String arName;

    private Integer arType;

    private Short arSide;

    private String arImportantPoints;

    private String arDuration;

    private String arNumber;

    private String arGroup;

    private Long arNumberScriptId;

    private Long arStartActionId;

    private String arScript;

    private String arStatus;

}
