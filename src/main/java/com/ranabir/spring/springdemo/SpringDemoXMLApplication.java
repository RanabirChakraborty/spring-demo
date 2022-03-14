package com.ranabir.spring.springdemo;

import com.ranabir.spring.springdemo.xml.XmlJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringDemoXMLApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringDemoXMLApplication.class);
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XmlJdbcDAO obj1 = applicationContext.getBean(XmlJdbcDAO.class);

            logger.info(String.valueOf(obj1));
            logger.info("{}" + obj1.getXmlJdbcConnection());
        }
    }
}
