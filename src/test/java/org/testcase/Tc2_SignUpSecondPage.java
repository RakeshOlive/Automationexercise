package org.testcase;

import org.base.BaseClass;
import org.pojo.RegistrationPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Tc2_SignUpSecondPage extends Tc1_Registrations {
	
	@Test
	private void tc2() {
		
		RegistrationPojo r = new RegistrationPojo();
		touch(r.getRadiobtngendermale());
		passValue(r.getSignupPassword(), "Rakesh@1212");
		
		//dropdown(r.getDaydropdown());
				
		
	}
	
	
	
	
	

}
