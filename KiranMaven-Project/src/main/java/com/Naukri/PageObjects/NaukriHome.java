package com.Naukri.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NaukriHome {
	WebDriver driver;
	public NaukriHome(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy (xpath="//button//div//b[text()='View and Update Profile']")
	WebElement ViewUpdateProfile;
	
	
	
	@FindBy(how=How.XPATH, using="//div[@id='rPanel']//h1//a[text()='Edit']")
	WebElement ProfileEdit;
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	WebElement ProfileSave;
	
	public void MyHomePage() throws Exception{
		Thread.sleep(5000);
		ViewUpdateProfile.click();
		System.out.println("title of the page is "+driver.getTitle());
		Thread.sleep(5000);
		Actions edi=new Actions(driver);
		edi.moveToElement(ProfileEdit);
		ProfileEdit.click();
		ProfileSave.click();
	} 
	
	
	

}

