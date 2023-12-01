package com.example.demo.module.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.example.demo.entity.po.ApiLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author LiuXuChao
 * @since 2023-12-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TbRole对象", description="")
public class TbRole extends ApiLogic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "角色描述")
    private String roleLabel;

    @ApiModelProperty(value = "级别,数字越小级别越大,业务从1 开始,可以并级,开后门从0往后开")
    private String roleLevel;

    @ApiModelProperty(value = "是否禁用  0否 1是")
    private Boolean isDisable;




}
