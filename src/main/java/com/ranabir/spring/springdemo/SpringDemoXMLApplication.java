package com.ranabir.spring.springdemo;

import com.ranabir.spring.springdemo.xml.XmlJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoXMLApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringDemoXMLApplication.class);
    public static void main(String[] args) {
        // Defining Spring Application Context using XML.
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // check the beans
            logger.info("Beans are loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlJdbcDAO obj1 = applicationContext.getBean(XmlJdbcDAO.class);

            logger.info(String.valueOf(obj1));
            logger.info("{}" + obj1.getXmlJdbcConnection());
        }
    }
}
