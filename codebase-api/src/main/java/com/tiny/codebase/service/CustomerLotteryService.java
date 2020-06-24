package com.tiny.codebase.service;

import java.util.List;

import com.tiny.codebase.entity.CustomerLottery;

public interface CustomerLotteryService {

    /**
     * 新增 用户奖券
     * @param bean 用户奖券
     * @return int
     */
    int add(CustomerLottery customerLottery);

    /**
     * 新增 用户奖券
     * @param bean 用户奖券
     * @return int
     */
    int addBatch(List<CustomerLottery> customerLotterys);

    /**
     * 编辑/更新 用户奖券
     * @param bean 用户奖券
     * @return 用户奖券
     */
    int update(CustomerLottery customerLottery);

    /**
     * 取得 用户奖券
     * @param customerLotteryId 主键ID
     * @return 用户奖券
     * @throws Exception
     */
    CustomerLottery get(long customerLotteryId);

    /**
     * 查询 用户奖券
     * @param bean 用户奖券
     * @throws Exception
     */
    List<CustomerLottery> query(CustomerLottery customerLottery);

    /**
     * 删除 用户奖券
     * @param customerLotteryId 主键ID
     * @return
     */
    int delete(long customerLotteryId);
}
