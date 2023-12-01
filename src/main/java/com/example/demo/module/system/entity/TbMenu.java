package com.example.demo.module.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@ApiModel(value="TbMenu对象", description="")
public class TbMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "模块名称")
    private String menuName;

    @ApiModelProperty(value = "模块的下级")
    private String menuJunior;

    private String roleId;

    private String menuEn;

    private String isDeleted;

    private Date createTime;

    private Date updateTime;


}
