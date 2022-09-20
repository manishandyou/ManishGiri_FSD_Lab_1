package com.greatlearning.service;

public class GenerateOTP {

		
		
		public int getOTP()
		
		{
			
		return	(int)(Math.random() * 3000) + 999;
		}
	}
