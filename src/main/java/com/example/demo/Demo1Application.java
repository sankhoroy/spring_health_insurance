package com.example.demo;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {
Logger logger = Logger.getLogger(Demo1Application.class);

	public static void main(String[] args) {
//		SpringApplication.run(Demo1Application.class, args);
//		Hello h = new  Hello();
//		h.say();
//		String log4jConfPath = "/path/to/log4j.properties";
//		PropertyConfigurator.configure(log4jConfPath);
		BasicConfigurator.configure();
//		Client bob = new Client("localhost", 6789);
//        bob.startRunning();
        
		Manager m = new Manager();
		m.approve();
////	
		
		//System.out.println("Hello");
//	   logger.debug("This is a debug message");
//	       logger.info("This is an info message");
//	       logger.warn("This is a warn message");
//	       logger.error("This is an error message");
//	       logger.fatal("This is a fatal message");
	}
}
