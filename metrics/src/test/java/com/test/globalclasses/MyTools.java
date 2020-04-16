package com.test.globalclasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
	public static void resource(String string) {
	        BufferedWriter bw = null;
	        FileWriter fw = null;


	        try {
	            String data = string + "\n";
	            File file = new File("C:\\Users\\luis.espindola\\Documents\\matrix2.txt");
	            // If file non exist so this create new
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            // flag true, indica adjuntar información al archivo.
	            fw = new FileWriter(file.getAbsoluteFile(), true);
	            bw = new BufferedWriter(fw);
	            bw.write(data);
	            //System.out.println("Information added!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                //close FileWriter y BufferedWriter
	                if (bw != null)
	                    bw.close();
	                if (fw != null)
	                    fw.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	    
	    public static void statusCode(String string) {
	        BufferedWriter bw = null;
	        FileWriter fw = null;


	        try {
	            String data = string + "\n";
	            File file = new File("C:\\\\Users\\\\luis.espindola\\\\Documents\\\\matrix2.txt");
	            // If file non exist so this create new
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            // flag true, indica adjuntar información al archivo.
	            fw = new FileWriter(file.getAbsoluteFile(), true);
	            bw = new BufferedWriter(fw);
	            bw.write(data);
	            //System.out.println("Information added!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                //close FileWriter y BufferedWriter
	                if (bw != null)
	                    bw.close();
	                if (fw != null)
	                    fw.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	    
	    
	    public static void responseBody(String string) {
	        BufferedWriter bw = null;
	        FileWriter fw = null;


	        try {
	            String data = string + "\n";
	            File file = new File("C:\\\\Users\\\\luis.espindola\\\\Documents\\\\matrix2.txt");
	            // If file non exist so this create new
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            // flag true, indica adjuntar información al archivo.
	            fw = new FileWriter(file.getAbsoluteFile(), true);
	            bw = new BufferedWriter(fw);
	            bw.write(data);
	            //System.out.println("Information added!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                //close FileWriter y BufferedWriter
	                if (bw != null)
	                    bw.close();
	                if (fw != null)
	                    fw.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	
}