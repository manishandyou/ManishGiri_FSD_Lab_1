package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Customer;

public class Banking {

	GenerateOTP otp= new GenerateOTP();
	
	
	public void deposit(Customer c2, int i)
	{
		String pwd;
		double newbalance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Customer password");
		pwd = sc.next();  //ritu123
		
		if(c2.validatePassword(pwd))
			
		{
			newbalance = c2.getBalance() + i;  //newbalance = 9100
			c2.setBalance(newbalance);
			
		}
		else
		{
			System.out.println("Please enter valid password");
		}
		
	}
	
	public void withdraw(Customer c1, double i)
	{
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Customer password");
		String pwd = sc.next(); //manish999
		if(c1.validatePassword(pwd))
		{
			
			int sms=otp.getOTP();
			System.out.println("OTP is :" + sms);
			System.out.println("Enter OTP");
			int o=sc.nextInt();
					
			if(o==sms)
			{
						if(c1.getBalance() - i >=0)
						{
							double newbal;
							newbal = c1.getBalance() - i;
							c1.setBalance(newbal);
							
						}
						else
						{
							System.out.println("Insufficient Funds");
						}
						
			}
			else
			{
				
				System.out.println("Enter valid OTP");
			}
			
		}
		else
		{
			
		}
	}
	
}
