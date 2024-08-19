package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	private WebElement btnregister;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	private WebElement loginMail;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	private WebElement loginpass;
	
	
	@FindBy(xpath= "//input[@data-qa='login-button']")
	private WebElement loginbtn;
	
	@FindBy (xpath="//a[text()=' Logout']")
	private WebElement logout;
	
	@FindBy (xpath="//a[text()=' Delete Account']")
	private WebElement deleteAcc;
	

}
