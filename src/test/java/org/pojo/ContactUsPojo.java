package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPojo extends BaseClass {

	public ContactUsPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "us")
	private WebElement contactUs;

	@FindBy(xpath = "//input[@data-qa='name']")
	private WebElement contactUsname;

	@FindBy(xpath = "//input[@data-qa='email']")
	private WebElement contactUsemail;

	@FindBy(xpath = "//input[@data-qa='subject']")
	private WebElement contactUssubject;
	
	@FindBy (xpath ="//textarea[@data-qa='message']")
	private WebElement contactUsmsg;
	
	@FindBy (name="upload_file")
	private WebElement fileUpload;
	
	@FindBy(xpath="//input[@data-qa='submit-button']")
	private WebElement submitbtn;

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getContactUsname() {
		return contactUsname;
	}

	public WebElement getContactUsemail() {
		return contactUsemail;
	}

	public WebElement getContactUssubject() {
		return contactUssubject;
	}

	public WebElement getContactUsmsg() {
		return contactUsmsg;
	}

	public WebElement getFileUpload() {
		return fileUpload;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	

}
