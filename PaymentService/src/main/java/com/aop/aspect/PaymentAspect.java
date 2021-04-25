package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {

	@Before("execution(* com.aop.service.PaymentServiceImpl.openAccount())")
	public void BeforeOpeningAccount() {
		System.out.println("Pls Check All the Documents");
	}
	
	@After("execution(* com.aop.service.PaymentServiceImpl.openAccount())")
	public void AfterOpeningAccount() {
		System.out.println("All Documents Checked and Verified");
		System.out.println("------------------------------------------------------------------");
	}
	
	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void BeforeMakingPayment() {
		System.out.println("Payment Started");
	}
	
	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void AfterMakingPayment() {
		System.out.println("Payment Completed");
	}
	
}
