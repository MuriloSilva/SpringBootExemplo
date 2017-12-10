package com.mumufactory.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class ApplicationTwo implements CommandLineRunner {
	
	@Value("${banco:${default.banco}}")
	private String banco;
	
	@Value("${agencia}")
	private String agencia;
	
	@Value("${conta}")
	private String conta;
	
	@Override
	public String toString(){		
		return 
				"Banco  : " + banco   + "\n" +
				"Agencia: " + agencia + "\n" +
				"Conta  : " + conta   + "\n";
	}
		
	@Override
	public void run(String ...args){		
		System.out.println(this.toString());
	}

}
