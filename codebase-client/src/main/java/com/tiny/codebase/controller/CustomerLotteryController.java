package com.tiny.codebase.controller;

import javax.annotation.Resource;

import com.tiny.codebase.entity.CustomerLottery;
import com.tiny.codebase.service.CustomerLotteryService;

public class CustomerLotteryController {
    
    @Resource
    private CustomerLotteryService customerLotteryService;
    
    public CustomerLottery get(long customerLotteryId) {
        return customerLotteryService.get(customerLotteryId);
    }

}
