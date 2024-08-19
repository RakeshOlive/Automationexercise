package org.grouping;

import org.testng.annotations.Test;

public class SignUpTest {

	@Test(priority = 1, groups = "Regression")

	private void wha() {
		System.out.println("whatsapp signup");

	}

	@Test(priority = 2, groups = "Regression")

	private void hike() {
		System.out.println("hike signup");

	}

	@Test(priority = 2, groups = "Regression")

	private void message() {
		System.out.println("message signup");

	}

}
