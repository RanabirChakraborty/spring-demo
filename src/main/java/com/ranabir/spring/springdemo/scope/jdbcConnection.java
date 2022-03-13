package com.ranabir.spring.springdemo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// For every one instance of PersonDAO it'll make different instance of jdbcConnection.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class jdbcConnection {
    public jdbcConnection() {
        System.out.println("jdbc connection established.");
    }
}
