package com.gr.jiang.dao;

import com.gr.jiang.po.impl.FinanceInfoPo;

import java.util.List;

/**
 * Created by jiang on 16/7/9.
 */
public interface FinanceInfoDao {
    /**
     * 分页查询
     * @param start
     * @param limit
     * @return
     */
    public List<FinanceInfoPo> queryFinanceInfo(int start, int limit);

    /**
     * 根据域名查询记录条数
     * @param organ
     * @return
     */
    public int queryRowNum(String organ);
}
