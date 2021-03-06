package com.ranabir.spring.springdemo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
    @Autowired
    jdbcConnection jdbcconnection;

    public jdbcConnection getJdbcconnection() {
        return jdbcconnection;
    }

    public void setJdbcconnection(jdbcConnection jdbcconnection) {
        this.jdbcconnection = jdbcconnection;
    }
}
