package com.globalClasses;

import java.util.ArrayList;

import com.github.javafaker.Faker;

public class RandomTools{
	
	Faker faker = new Faker();
	
	public long generateNumberPhoneRandomlong() {
		long numberPhone;
		String lada = "312";
		
		int random = (int)(Math.random()*(9999999-0000000+1)+0000000);
		String randomString = lada + String.valueOf(random);
		
		numberPhone =  Long.parseLong(randomString);
		
		return numberPhone;
	}
	
	public long generateNumeric() {		
		return (long)(Math.random()*(9999999-0000000+1)+0000000);
	}
	
	public String generateNumberPhoneRandomStringOL() {
		String numberPhone;
		String lada = "312";
		
		int random = (int)(Math.random()*(9999999-0000000+1)+0000000);
		int random2 =(int)(Math.random()*(9999999-0000000+1)+0000000);
		numberPhone = lada + String.valueOf(random)+String.valueOf(random2);
			
		return numberPhone;
	}
	
	public String generateNumberPhoneRandomString() {
		String numberPhone;
		String lada = "312";
		
		int random = (int)(Math.random()*(9999999-0000000+1)+0000000);
		numberPhone  = lada + String.valueOf(random);
		
		return numberPhone;
	}
	
	public String randomFirstName() {
		String firstName = faker.name().firstName();
		return firstName;
	}
	
	public String randomLastName() {
		String lastName = faker.name().lastName();
		return lastName;
	}
	
	public String randomFirstNameOL() {
		String firstName = faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName()+faker.name().firstName();
		return firstName;
	}
	
	public String randomLastNameOL() {
		String lastName = faker.name().lastName()+faker.name().lastName()+faker.name().lastName();
		return lastName;
	}
	
	public String randomSpecialCharacteres() {
		String specialCharacters = "";
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("#");		list.add("$");		list.add("%");		list.add("&");		list.add("/");
		list.add("(");		list.add(")");		list.add("=");		list.add("?");		list.add("+");
		list.add("*");		list.add("{");		list.add("[");		list.add("}");		list.add("]");
		list.add("-");		list.add("_");		list.add(":");		list.add(";");		list.add(".");
		list.add(",");		list.add("<");		list.add(">");		list.add("@");		list.add("¿");
		list.add("!");
		
		for(int i = 0; i < 10; i++) {
			specialCharacters = specialCharacters+list.get((int) (Math.random()*(25-0+1)+0));
		}
		
		return specialCharacters;
	}
	
	public String randomPokemon() {
		return faker.pokemon().name();
	}
	
	public String randomHacker() {
		return faker.hacker().noun();
	}
	
	
	public int randomDays() {
		return (int)(Math.random()*(30-0+1)+0);
	}
	
}