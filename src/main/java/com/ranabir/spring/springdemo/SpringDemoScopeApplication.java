package com.ranabir.spring.springdemo;

import com.ranabir.spring.springdemo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringDemoScopeApplication.class, args);

        // from the applicationContext we'll get a bean of the @Component mentioned class
        PersonDAO obj1 = applicationContext.getBean(PersonDAO.class);
        PersonDAO obj2 = applicationContext.getBean(PersonDAO.class);

        // if we don't use @Scope("prototype") at BinarySearchImpl then for both obj1 and obj2 the instance will be same.
        LOGGER.info("{}"+obj1);
        LOGGER.info("{}"+obj1.getJdbcconnection());

        LOGGER.info("{}"+obj2);
        LOGGER.info("{}"+obj2.getJdbcconnection());

    }

}
