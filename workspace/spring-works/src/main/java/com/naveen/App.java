package com.naveen;

import com.naveen.config.InsuranceConfig;
import com.naveen.dao.IInsuranceDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext context
                = new AnnotationConfigApplicationContext(InsuranceConfig.class);

//        IInsuranceDAO dao = (IInsuranceDAO) context.getBean("dummyInsurance");

        IInsuranceDAO dao = context.getBean("dummyInsurance", IInsuranceDAO.class);
        System.out.println("number of insurance(dummy) : " + dao.count());


        IInsuranceDAO dao1 = context.getBean("dummyInsurance", IInsuranceDAO.class);
        System.out.println("number of insurance(dummy)(2) : " + dao.count());


        dao = context.getBean("myinsurance", IInsuranceDAO.class);
        System.out.println("number of insurance(jdbc) : " + dao.count());

        System.out.println("should call destroy... ");
        ((AnnotationConfigApplicationContext)context).registerShutdownHook();

    }
}
