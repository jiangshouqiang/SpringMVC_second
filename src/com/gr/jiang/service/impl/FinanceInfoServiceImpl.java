package com.gr.jiang.service.impl;

import com.gr.jiang.bo.FinanceInfoBo;
import com.gr.jiang.po.impl.FinanceInfoPo;
import com.gr.jiang.service.FinanceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiang on 16/7/9.
 */
@Service
public class FinanceInfoServiceImpl implements FinanceInfoService {
    @Autowired
    private FinanceInfoBo financeInfoBo ;
    @Override
    public List<FinanceInfoPo> queryFinanceInfo(int start, int limit) {
        return null;
    }

    @Override
    public int queryRowNum(String organ) {
        return financeInfoBo.queryRowNum(organ);
    }
}
