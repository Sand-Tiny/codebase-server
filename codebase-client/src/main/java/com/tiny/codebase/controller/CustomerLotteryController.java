package com.tiny.codebase.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiny.codebase.entity.CustomerLottery;
import com.tiny.codebase.service.CustomerLotteryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户奖品", tags = "用户奖品", description = "用户奖品")
@RequestMapping("customerLottery")
@RestController
public class CustomerLotteryController {

    @DubboReference(version = "1.0.0", check = false)
    private CustomerLotteryService customerLotteryService;

    @GetMapping("get")
    @ApiOperation(value = "查询")
    public CustomerLottery get(long customerLotteryId) {
        return customerLotteryService.get(customerLotteryId);
    }

}
