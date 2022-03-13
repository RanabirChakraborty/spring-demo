package com.ranabir.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
    @Autowired
    ComponentJdbcConnection jdbcconnection;

    public ComponentJdbcConnection getJdbcconnection() {
        return jdbcconnection;
    }

    public void setJdbcconnection(ComponentJdbcConnection jdbcconnection) {
        this.jdbcconnection = jdbcconnection;
    }
}
