package com.example.demo.entity.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/11/27 14:24
 * @version: 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ApiLogic extends BaseTime{

    private static final long serialVersionUID = 1L;

    public static final String IS_DELETED = "is_deleted";

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private String isDeleted = "0";
}
