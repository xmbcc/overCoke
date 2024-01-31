package com.lujiaxin.coke.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Action {

    @TableId(value = "action_id", type = IdType.AUTO)
    private long actionId;

    private String actionName;

    //动作类型
    private Integer actionType;

    private String actionAnimeUrl;

    private Timestamp actionCreateTime;

    private String actionPicUrl;

    private String actionScript;

    private String actionPrinciple;

    private String actionDuration;

    private String actionMaskUrl;

    private Long actionTimes;

    private Long actionRuleIndex;

    private Integer actionStretch;

    private String actionAngleLabel;

    private String actionFunctionLabel;

    private String actionStand;

    private Integer actionLevel;

    private Short actionSide;

    private String actionPart;

    private String actionMuscle;

    private Integer actionNumber;

    private Integer actionGroupNumber;

    private String actionPurpose;

    private String actionLongPic;

    private String actionNote;

    private Long actionNumberId;

    private Long actionPoseScriptId;

    private Long actionPoseScriptDetailsId;

    private Long actionProcessId;

    private Long actionBreatheId;

    private Long actionCorrectMethodId;

    private Long actionStartId;

    private Long actionIntroId;

    private String actionPrincipleAbstract;

    private String actionDetailAbstract;

    private String actionMistakeAbstract;

    private String actionNumberScript;

    private String actionGroupScript;

    private String actionAnimeReversedUrl;

    private String actionCategory;

    private Long actionRuleId;

    private String actionExplanationVideoUrl;

}
