
/* 
 * 创建日期 2020-06-24
 * 版权所有
 */
package com.tiny.codebase.dao;

import java.util.List;

import com.tiny.codebase.entity.CustomerLottery;

/**
 * 用户奖券 服务 
 * 
 * @author Tiny.Liu
 * @version 1.0
 */
public interface CustomerLotteryDao {

    /**
     * 新增 用户奖券
     * @param customerLottery 用户奖券
     * @return int
     * @throws Exception
     */
    int add(CustomerLottery customerLottery);
    
    /**
     * 批量新增 用户奖券
     * @param customerLottery 用户奖券
     * @return int
     * @throws Exception
     */
    int addBatch(List<CustomerLottery> customerLotterys);
    
    /**
     * 更新 用户奖券
     * @param customerLottery 用户奖券
     * @return 用户奖券
     * @throws Exception
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
     * @param customerLottery 查询参数
     * @throws Exception
     */
    List<CustomerLottery> query (CustomerLottery customerLottery);

    /**
     * 删除 用户奖券
     * @param customerLotteryId 主键ID
     * @return
     */
    int delete(long customerLotteryId);
}
