package com.ydsworld.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public abstract class BaseJdbcDAO {

    @Autowired
    protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public BaseJdbcDAO() {}
}
