package com.example.demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HealthInsuranceSurveyor  implements surveyor{
	Logger logger = LogManager.getLogger("Demo1Application.class");
	@Override
	public boolean validateClaim() {
		//System.out.println("Validating Claim");
		logger.info("Validating Claim");
		return true;
	}

}