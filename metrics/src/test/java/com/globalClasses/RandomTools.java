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
	
	
	public String commentsNumeric() {
		String str = "";
		
		int random = (int)(Math.random()*(9999999-0000000+1)+0000000);
		str =  String.valueOf(random) + " " +  String.valueOf(random)+ " " +  String.valueOf(random)+ " " +  String.valueOf(random)+ " " +  String.valueOf(random) ;
		
		
		return str;
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
		
		for(int i = 0; i < 24; i++) {
			specialCharacters = specialCharacters+list.get((int) (Math.random()*(25-0+1)+0));
		}
		
		return specialCharacters;
	}
	
	public String idLetters() {
		String id = "";
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");		list.add("b");		list.add("c");		list.add("d");		list.add("e");
		list.add("f");		list.add("g");		list.add("h");		list.add("i");		list.add("j");
		list.add("k");		list.add("l");		list.add("m");		list.add("n");		list.add("o");
		list.add("p");		list.add("q");		list.add("r");		list.add("s");		list.add("t");
		list.add("u");		list.add("v");		list.add("w");		list.add("x");		list.add("y");
		list.add("z");
		
		for(int i = 0; i < 24; i++) {
			id = id+list.get((int) (Math.random()*(25-0+1)+0));
		}
		
		return id;
	}
	
	public String idNumber() {
		String id = "";
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("0");		list.add("1");		list.add("2");		list.add("3");		list.add("4");
		list.add("5");		list.add("6");		list.add("7");		list.add("8");		list.add("9");
		
		for(int i = 0; i < 24; i++) {
			id = id+list.get((int) (Math.random()*(9-0+1)+0));
		}
		
		return id;
	}
	
	
	
	public String alphanumeric() {
		String alphanumeric = "";
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");		list.add("b");		list.add("c");		list.add("d");		list.add("e");
		list.add("f");		list.add("g");		list.add("h");		list.add("i");		list.add("j");
		list.add("k");		list.add("l");		list.add("m");		list.add("n");		list.add("o");
		list.add("p");		list.add("q");		list.add("r");		list.add("s");		list.add("t");
		list.add("u");		list.add("v");		list.add("w");		list.add("x");		list.add("y");
		list.add("z");
		
		list.add("0");		list.add("1");		list.add("2");		list.add("3");		list.add("4");
		list.add("5");		list.add("6");		list.add("7");		list.add("8");		list.add("9");
		
		for(int i = 0; i < 10; i++) {
			alphanumeric = alphanumeric+list.get((int) (Math.random()*(35-0+1)+0));
		}
		
		return alphanumeric;
	}
	
	
	
	public String randomNumberLetters() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("zero");		list.add("one");		list.add("two");		list.add("three");		list.add("four");
		list.add("five");		list.add("six");		list.add("seven");		list.add("eight");		list.add("nine");

		
		return list.get((int) (Math.random()*(9-0+1)+0));
	}
	
	public String randomAlphanumeric() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("zero");		list.add("one");		list.add("two");		list.add("three");		list.add("four");
		list.add("five");		list.add("six");		list.add("seven");		list.add("eight");		list.add("nine");

		int random = (int) (Math.random()*(9-0+1)+0);
		return list.get(random)+ String.valueOf(random);
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