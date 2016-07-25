package com.gr.jiang.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by jiang on 16/7/9.
 */
public class MysqlBaseDB {

    private JdbcTemplate mysqlJdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        System.out.println("jdbcTemplate");
        this.mysqlJdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getMysqlJdbcTemplate() {
        return mysqlJdbcTemplate;
    }
}
