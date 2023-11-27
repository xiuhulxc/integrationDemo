package com.example.demo.entity.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/11/27 14:26
 * @version: 1.0
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class BaseTime {

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    /**
     * 创建时间
     */
    @TableField(value = CREATE_TIME, fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = UPDATE_TIME, fill = FieldFill.INSERT_UPDATE, update = "NOW()")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;
}
