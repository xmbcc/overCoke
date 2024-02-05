package com.lujiaxin.coke.config.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * 每个任务都会持久化记录表，更新状态
 * @author lujiaxin
 * @date 2024/1/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogKeepStatus {

    private Long id;
    private String name;
    private String data;
    private Timestamp createTime;
    private Timestamp finashTime;
    private Long createUserId;
    /**
     * 记录任务状态
     */
    private Integer status;

}
