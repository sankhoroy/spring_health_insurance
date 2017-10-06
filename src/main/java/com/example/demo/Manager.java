package com.example.demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Manager {
	private static Logger logger = Logger.getLogger("Manager.class");

	surveyor s;
	  public Manager() {
	s= new HealthInsuranceSurveyor();
	
	  }
	
	
	void approve()
	{
//		 logger.debug("This is a debug message");
//	       logger.info("This is an info message");
//	       logger.warn("This is a warn message");
//	       logger.error("This is an error message");
//	       logger.fatal("This is a fatal message");
		boolean b =  s.validateClaim();
		if(b == true)
		{
			//System.out.println("Insurance approved");
			logger.info("Insurance Approved");
		}
		else
		{
			//System.out.println("Insurance not approved");
			logger.info("Insurance not Approved");
		}
	}
}