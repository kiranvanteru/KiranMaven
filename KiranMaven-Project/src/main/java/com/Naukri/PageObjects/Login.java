package com.Naukri.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Login {
  
	WebDriver driver;
	public Login(WebDriver driver){
		
	}
	
	@FindBy(xpath="//a//div[text()='Login']")
	WebElement LoginButton;
	
	@FindBy(id="uSel")
	WebElement UserNameTab;
	
	@FindBy(id="uLogin")
	WebElement UserName;

	@FindBy(id="pLogin")
	WebElement Password;
	
	@FindBy(xpath="//button[@value='Login']")
	WebElement Login;
	
	public void LoginNaukriHome(String un, String pw){
		
		LoginButton.click();
		UserNameTab.click();
		UserName.sendKeys(un);
		Password.sendKeys(pw);
		Login.click();
		
		
	}
	
	
	
	
}


