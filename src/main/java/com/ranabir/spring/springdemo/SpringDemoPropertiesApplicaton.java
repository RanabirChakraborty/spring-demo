package com.ranabir.spring.springdemo;

        import com.ranabir.spring.springdemo.properties.SomeExternalService;
        import com.ranabir.spring.springdemo.scope.PersonDAO;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.PropertySource;

@Configuration  // needs to define to start Spring application.
@ComponentScan  // to define "com.ranabir.spring.springdemo" needs to scan for component.
@PropertySource("classpath:app.properties")
public class SpringDemoPropertiesApplicaton {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoScopeApplication.class);

    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDemoScopeApplication.class)) {

            SomeExternalService obj1 = applicationContext.getBean(SomeExternalService.class);

            LOGGER.info("{}" + obj1.returnServiceURL());

        }
    }
}