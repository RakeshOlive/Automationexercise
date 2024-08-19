package org.grouping;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1,groups= {"sanity"})
	
	private void face() {
		System.out.println("login facebook");
		
	}
	
	
	
	@Test(priority=2,groups= {"sanity"})
	
	private void insta() {
		System.out.println("insta login");
	

	}
	
	
	@Test(priority=3,groups= {"sanity"})
	
	private void goog() {
		
		
		System.out.println("login google");
		

	}
	
	@Test(dependsOnMethods="goog")
	private void fireFox() {
		System.out.println("runnig");

	}
	

}
