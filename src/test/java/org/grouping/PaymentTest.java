package org.grouping;

import org.testng.annotations.Test;

public class PaymentTest {
	
	
	@Test (priority=1,groups= {"Regression","sanity","functional"})
	
	private void indMoney() {
		System.out.println("IndiaN Rupee");
	}
	
	@Test (priority=1,groups= {"Regression","sanity","functional"})
	private void dollars() {
		System.out.println("America dollar");
	}

}
