package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;
import com.aop.service.PaymentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       PaymentService paymentService = context.getBean("payment",PaymentService.class);
       paymentService.openAccount();
       paymentService.makePayment(5000);
    }
}
