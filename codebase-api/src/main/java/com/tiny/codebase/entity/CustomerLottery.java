
/* 
 * 创建日期 2020-06-24
 */
package com.tiny.codebase.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户奖券
 * 
 * @author Tiny.Liu
 * @version 1.0
 */
@Data
@ApiModel("用户奖券")
public class CustomerLottery implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @ApiModelProperty(value = "ID")
    private Long customerLotteryId;
    
    @ApiModelProperty(value = "活动批次ID")
    private Long activityId;
    
    @ApiModelProperty(value = "记录状态 0-待使用 1-部分使用 2-全部使用 3-已过期")
    private Integer status;
    
    @ApiModelProperty(value = "奖券批次ID")
    private Long lotteryId;
    
    @ApiModelProperty(value = "叠加金金额ID")
    private Long lotteryMoneyId;
    
    @ApiModelProperty(value = "叠加金总金额")
    private BigDecimal money;
    
    @ApiModelProperty(value = "已使用金额")
    private BigDecimal usedMoney;
    
    @ApiModelProperty(value = "可用用金额")
    private BigDecimal usableMoney;
    
    @ApiModelProperty(value = "已锁定金额")
    private BigDecimal lockedMoney;
    
    @ApiModelProperty(value = "中奖用户ID")
    private Long customerId;
    
    @ApiModelProperty(value = "中奖用户手机号")
    private String mobile;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "有效期的开始时间，精确到秒")
    private Date effectiveTimeStart;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "有效期的结束时间，精确到秒")
    private Date effectiveTimeEnd;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间,该记录如果是中奖则为中奖时间，该记录为使用则为使用时间，该记录为过期，则为过期时间")
    private Date createdDate;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "最近更新时间")
    private Date updatedDate;
}
    