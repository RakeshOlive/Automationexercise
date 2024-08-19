package org.base;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.startsWith("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}

	}
	public static  void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void max() {
		driver.manage().window().maximize();

	}
	
	public static void closing() {
		driver.close();

	}
	
	public static void touch(WebElement element) {
		element.click();
		

	}
	
	public static void passValue(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	
	public static void getDateandTime() {
		
		Date d = new Date();
		System.out.println(d);
		

	}
	
	public static void dropdown(WebElement list) {
		Select s = new Select(list);
	
	}
	

}
