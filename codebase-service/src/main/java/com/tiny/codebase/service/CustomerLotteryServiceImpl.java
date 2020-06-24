
/* 
 * 创建日期 2020-06-24
 *
 */
package com.tiny.codebase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiny.codebase.dao.CustomerLotteryDao;
import com.tiny.codebase.entity.CustomerLottery;
import com.tiny.codebase.service.CustomerLotteryService;

/**
 * 用户奖券 服务 
 * 
 * @author Tiny.Liu
 * @version 1.0
 */
@Service
public class CustomerLotteryServiceImpl implements CustomerLotteryService {
    
    @Autowired
    private CustomerLotteryDao customerLotteryDao;
    
    /**
     * 新增 用户奖券
     * @param bean 用户奖券
     * @return int
     */
    @Override
    public int add(CustomerLottery customerLottery){
        int row = customerLotteryDao.add(customerLottery);
        return row;
    }
    
    /**
     * 新增 用户奖券
     * @param bean 用户奖券
     * @return int
     */
    @Override
    public int addBatch(List<CustomerLottery> customerLotterys){
        int row = customerLotteryDao.addBatch(customerLotterys);
        return row;
    }
    
    /**
     * 编辑/更新 用户奖券
     * @param bean 用户奖券
     * @return 用户奖券
     */
    @Override
    public int update(CustomerLottery customerLottery){
        int row = customerLotteryDao.update(customerLottery);
        return row;
    }

    /**
     * 取得 用户奖券
     * @param customerLotteryId 主键ID
     * @return 用户奖券
     * @throws Exception
     */
    @Override
    public CustomerLottery get(long customerLotteryId){
        CustomerLottery result = customerLotteryDao.get(customerLotteryId);
        return result;
    }
    
    /**
     * 查询 用户奖券
     * @param bean 用户奖券
     * @throws Exception
     */
    @Override
    public List<CustomerLottery> query(CustomerLottery customerLottery) {
        List<CustomerLottery> result = customerLotteryDao.query(customerLottery);
        return result;
    }

    /**
     * 删除 用户奖券
     * @param customerLotteryId 主键ID
     * @return
     */
    @Override
    public int delete(long customerLotteryId){
        int row = customerLotteryDao.delete(customerLotteryId);
        return row;
    }
}
