package com.lujiaxin.coke.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @TableId(value = "client_id",type = IdType.AUTO)
    private Long clientId;

    private String clientName;

    private String clientPassword;

    private String openId;

    private String unionId;

    private String clientImgUrl;

    private Timestamp lastLoginTime;

    private Timestamp createTime;

    private Timestamp updateTime;

    private Double totalExerciseTime;

    private String phone;

    private Long clientTherapistId;

    private Long curriculumId;

    private Timestamp startTime;

    private Timestamp endTime;

    /**
     * 用户所属治疗阶段
     */
    private Integer clientTreatmentPhase;

    /**
     * 最后一次训练时间，完成度大于0才会存入此训练时间
     */
    private Timestamp lastTrainingTime;

    private String clientStatus;

    private Double clientHeight;

    private Double clientWeight;

    private String clientGender;

    private Date clientBirthday;

    private String illness;

    private Long partnershipId;

}
