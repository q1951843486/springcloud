package com.meiya.platform.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @ClassName IndexVo
 * @Author Administrator
 * @date 2020.01.16 17:06
 */
@Data
@ApiModel(description = "首页vo")
public class IndexVo {

    @ApiModelProperty(name = "余额")
    private double balance;
    @ApiModelProperty(name = "历史调用总量")
    private int historyTransferTotal;
    @ApiModelProperty(name = "历史消费总额")
    private double historyTotalAmount;
    @ApiModelProperty(name = "今日调用总量")
    private int todayTransferTotal;
    @ApiModelProperty(name = "今日调用总量")
    private double todayTotalAmount;


}
