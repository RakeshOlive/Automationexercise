package org.testcase;

import org.base.BaseClass;
import org.pojo.RegistrationPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.fasterxml.jackson.annotation.JsonFilter;

public class Tc1_Registrations extends BaseClass {
	
	
	
	@BeforeClass
	private void openBrowser() {
		browserLaunch("chrome");
		launchUrl("https://automationexercise.com/");
		max();

	}
	
	@BeforeMethod
	private void startTime() {
		getDateandTime();

	}
	
	@Test
	@Parameters({"registername","registeremail"})
	private void tc1(String rname,String remail) {
		
		RegistrationPojo r = new RegistrationPojo();
		touch(r.getBtnregister());
		passValue(r.getTxtsignupname(), rname);
		passValue(r.getTxtemailsignup(), remail);
		touch(r.getBtnsignup());

	}
	

	@AfterMethod
	private void endTime() {
		getDateandTime();

	}
	
	@AfterClass
	private void closePage() {
		closing();

	}
	
	
	
	
	

}
