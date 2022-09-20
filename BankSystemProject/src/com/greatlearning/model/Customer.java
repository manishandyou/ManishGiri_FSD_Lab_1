package com.greatlearning.model;

// POJO Class Plain Old Java Object

public class Customer {

	
	private String customername;
	private long accno;
	private double balance;
	private String password;
	
	
	
	public Customer() {
		
	this.customername = "Manish";
	this.accno = 12345;
	this.balance = 5000;
	this.password = "manish999";
	
	}
	
	public Customer(String customername, long accno, double balance, String password) {
		super();
		this.customername = customername;
		this.accno = accno;
		this.balance = balance;
		this.password = password;
		
		
	}
	
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validatePassword(String pwd)
	{

		if(this.password.equals(pwd))
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
	}
	
}
