package com.gr.jiang.dao.impl;

import com.gr.jiang.dao.FinanceInfoDao;
import com.gr.jiang.db.MysqlBaseDB;
import com.gr.jiang.po.impl.FinanceInfoPo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by jiang on 16/7/9.
 */
@Repository
@Transactional
public class FinanceInfoDaoImpl extends MysqlBaseDB implements FinanceInfoDao {
    private String queryRowNumSql = "SELECT COUNT(1) domainCount FROM FINANCEINFO WHERE ORGAN=?" ;

    @Override
    public List<FinanceInfoPo> queryFinanceInfo(int start, int limit) {
        return null;
    }

    @Override
    public int queryRowNum(String organ) {
        return getMysqlJdbcTemplate().queryForObject(queryRowNumSql,new String[]{organ},Integer.class);
    }
}
