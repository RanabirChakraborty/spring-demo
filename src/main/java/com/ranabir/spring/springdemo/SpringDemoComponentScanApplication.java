package com.ranabir.spring.springdemo;

import com.ranabir.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// to provide the path where it needs to search for the @Component
@ComponentScan("com.ranabir.spring.componentscan")
public class SpringDemoComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoComponentScanApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDemoComponentScanApplication.class, args);

        // from the applicationContext we'll get a bean of the @Component mentioned class
        ComponentDAO obj1 = applicationContext.getBean(ComponentDAO.class);
        ComponentDAO obj2 = applicationContext.getBean(ComponentDAO.class);

        // if we don't use @Scope("prototype") at BinarySearchImpl then for both obj1 and obj2 the instance will be same.
        LOGGER.info("{}" + obj1);
        LOGGER.info("{}" + obj1.getJdbcconnection());

        LOGGER.info("{}" + obj2);
        LOGGER.info("{}" + obj2.getJdbcconnection());
    }
}
