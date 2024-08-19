package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class RegistrationPojo extends BaseClass {

	public RegistrationPojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Signup / Login']")
	private WebElement btnregister;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement txtsignupname;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement txtemailsignup;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement btnsignup;

	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement radiobtngendermale;

	@FindBy(xpath = "//input[@id='uniform-id_gender2']")
	private WebElement radiobtngenderfemale;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement signupPassword;

	@FindBy(xpath = "//select[@id='days']")
	private List<WebElement> daydropdown;

	@FindBy(xpath = "//select[@id='months']")
	private List<WebElement> monthdropdown;

	@FindBy(xpath = "//select[@id='years']")
	private List<WebElement> yeardropdown;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement signupcheckbox;

	@FindBy(xpath = "//input[@id='optin']")
	private WebElement receivecheckBox;

	@FindBy(xpath = "//input[@data-qa='first_name']")
	private WebElement addressinfoFirstName;

	@FindBy(xpath = "//input[@data-qa='last_name']")
	private WebElement addressinfoLasttName;

	@FindBy(xpath = "//input[@data-qa='company']")
	private WebElement addressinfoCompany;

	@FindBy(xpath = "//input[@data-qa='address']")
	private WebElement companyAddress;

	@FindBy(xpath = "//select[@data-qa='country']")
	private List<WebElement> countrydropdown;

	@FindBy(xpath = "//input[@data-qa='state']")
	private WebElement addressinfoState;

	@FindBy(xpath = "//input[@data-qa='city']")
	private WebElement addressinfoCity;

	@FindBy(xpath = "//input[@data-qa='zipcode']")
	private WebElement addressinfoZip;

	@FindBy(xpath = "//input[@data-qa='mobile_number']")
	private WebElement addressinfoMobilenumb;

	@FindBy(xpath = "//input[@data-qa='create-account']")
	private WebElement addressinfoCreaAcc;
	
	
	@FindBy (xpath ="//b[contains (text(),'Account Created!')]")
	private WebElement accSuccessMsg;
	
	@FindBy (xpath="//a[text()='Continue']")
	private WebElement conbtn;
	

	public WebElement getSignupcheckbox() {
		return signupcheckbox;
	}

	public WebElement getReceivecheckBox() {
		return receivecheckBox;
	}

	public WebElement getAddressinfoFirstName() {
		return addressinfoFirstName;
	}

	public WebElement getAddressinfoLasttName() {
		return addressinfoLasttName;
	}

	public WebElement getAddressinfoCompany() {
		return addressinfoCompany;
	}

	public WebElement getCompanyAddress() {
		return companyAddress;
	}

	public List<WebElement> getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getAddressinfoState() {
		return addressinfoState;
	}

	public WebElement getAddressinfoCity() {
		return addressinfoCity;
	}

	public WebElement getAddressinfoZip() {
		return addressinfoZip;
	}

	public WebElement getAddressinfoMobilenumb() {
		return addressinfoMobilenumb;
	}

	public WebElement getAddressinfoCreaAcc() {
		return addressinfoCreaAcc;
	}

	public List<WebElement> getMonthdropdown() {
		return monthdropdown;
	}

	public List<WebElement> getYeardropdown() {
		return yeardropdown;
	}

	public WebElement getSignupPassword() {
		return signupPassword;
	}

	public List<WebElement> getDaydropdown() {
		return daydropdown;
	}

	public WebElement getRadiobtngendermale() {
		return radiobtngendermale;
	}

	public WebElement getRadiobtngenderfemale() {
		return radiobtngenderfemale;
	}

	public WebElement getBtnregister() {
		return btnregister;
	}

	public WebElement getTxtsignupname() {
		return txtsignupname;
	}

	public WebElement getTxtemailsignup() {
		return txtemailsignup;
	}

	public WebElement getBtnsignup() {
		return btnsignup;
	}

}
