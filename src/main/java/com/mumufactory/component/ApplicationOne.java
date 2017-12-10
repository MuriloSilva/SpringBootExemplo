package com.mumufactory.component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class ApplicationOne implements CommandLineRunner {
	
	private Date date;
	
	@Value("${bornDate:17530101}")
	public void setDate(String date) {
		try{
			this.date = new SimpleDateFormat("yyyyMMdd").parse(date);
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
	@Value("${firstName:}")
	private String firstName;
	
	@Value("${lastName:}")
	private String lastName;
	
	@Value("${address:não informado}")
	private String Address;
	
	@Override
	public void run(String ...args){
		System.out.println(
		"First Name : " + firstName 	+ "\n" + 
		"Last Name  : " + lastName 	+ "\n" + 
		"Address    : " + Address 	+ "\n" +
		"Born Date  : " + new SimpleDateFormat("dd/MM/yyyy").format(date)
		);		
	}

}
