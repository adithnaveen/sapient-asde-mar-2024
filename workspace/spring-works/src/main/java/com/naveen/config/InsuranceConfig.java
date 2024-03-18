package com.naveen.config;

import com.naveen.dao.DummyInsurance;
import com.naveen.dao.JDBCInsurance;
import org.springframework.context.annotation.*;

// if you have a class which has @Configuration annotation
// then that class shall load at scafolding time
@Configuration
@ComponentScan(basePackages =  {"com.naveen.dao","com.naveen.aop"})
@EnableAspectJAutoProxy
public class InsuranceConfig {

    // you can give logical name for the return
    // or method name is considered as bean id


    // if the method is not annotated with @Bean
    // then spring will not look at this method for
    // instantiation, by default spring does singleton
    @Bean
    @Scope("prototype") // by default singleton
    public DummyInsurance dummyInsurance() {
        return  new DummyInsurance();
    }

    @Bean(name = "myinsurance", initMethod = "init", destroyMethod = "destroy")

//    @Lazy -- will load the bean only when called
    public JDBCInsurance jdbcInsurance() {
        return new JDBCInsurance();
    }


}
