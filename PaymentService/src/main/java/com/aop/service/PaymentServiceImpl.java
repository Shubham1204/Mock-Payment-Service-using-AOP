package com.aop.service;

import org.springframework.stereotype.Component;

@Component("payment")
public class PaymentServiceImpl implements PaymentService{

	public void openAccount() {
		System.out.println("Opening bank account with 0 balance");
	}

	public void makePayment(int amt) {
		System.out.println("Amount : "+amt+" is been debited from your current account");
		System.out.println("Amount : "+amt+" is been credited in your savings account");
	}

}
