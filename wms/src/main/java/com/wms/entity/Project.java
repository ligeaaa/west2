package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author wms
 * @since 2023-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Project对象", description="")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "创始人id")
    private Integer id;

    @ApiModelProperty(value = "主键")
    @TableId(value = "Pid", type = IdType.AUTO)
    private Integer pid;

    @ApiModelProperty(value = "项目材料")
    private String material;

    @ApiModelProperty(value = "0表示审核中，1表示审核通过")
    private Integer state;

    @ApiModelProperty(value = "筹资金额")
    private Integer money;


}
