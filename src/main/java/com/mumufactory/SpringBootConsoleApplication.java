package com.mumufactory;

import static java.lang.System.exit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mumufactory.service.HelloMessageService;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    @Autowired
    private HelloMessageService helloService;

    public static void main(String[] args) throws Exception {
        
    	Class<?> clazz = SpringBootConsoleApplication.class;
    	if(args.length > 0){
    		try{
    			clazz = Class.forName(args[0]);    			
    		}catch(ClassNotFoundException e){
    			System.out.println(args[0] + " não é uma classe valida!");
    		}
    	}
    	System.out.println(clazz.getName());
    	
        SpringApplication app = new SpringApplication(clazz);
//        disabled banner, don't want to see the spring logo
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        exit(0);
    }

    @Override
    public void run(String... args) throws Exception {	
        if (args.length > 0) {
            System.out.println(helloService.getMessage(args[0].toString()));
        } else {
            System.out.println(helloService.getMessage());
        }        
    }
}