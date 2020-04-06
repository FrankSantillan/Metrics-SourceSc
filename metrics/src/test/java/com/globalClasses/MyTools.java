package com.globalClasses;

public class MyTools{
	
	public long generateNumberPhoneRandom() {
		long numberPhone;
		String lada = "312";
		
		int random = (int)(Math.random()*(9999999-0000000+1)+0000000);
		String randomString = lada + String.valueOf(random);
		
		numberPhone =  Long.parseLong(randomString);
		System.out.println(numberPhone);
		
		return numberPhone;
	}
	
}