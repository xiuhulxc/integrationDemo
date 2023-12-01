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
@ApiModel(value="TbCard对象", description="")
public class TbCard implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String menuId;

    @ApiModelProperty(value = "卡片名称")
    private String cardName;

    private String isDeleted;

    private Date createTime;

    private Date updateTime;


}
