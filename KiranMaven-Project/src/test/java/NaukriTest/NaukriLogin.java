package NaukriTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import browserScreen.Screenshots;

import com.Naukri.PageObjects.Login;
import com.Naukri.PageObjects.NaukriHome;

import utils.InitializeBrowser;

public class NaukriLogin {
	WebDriver driver;
	
	Login nlog;
	NaukriHome mnh;
  @Test
  public void f() throws Exception {
	  driver.get("https://naukri.com");
	  System.out.println(driver.getTitle());
	  
	  nlog=PageFactory.initElements(driver, Login.class);
	  mnh=PageFactory.initElements(driver, NaukriHome.class);
	  nlog.LoginNaukriHome("kiranv23", "kiran1234");
	  Screenshots.driverScreen(driver, "NaukriHome");
	  mnh.MyHomePage();
	  Screenshots.driverScreen(driver, "MyNaukri");
	  System.out.println("title of the page is "+driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=InitializeBrowser.OpenDriver("firefox");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	 
//	  driver=new FirefoxDriver();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
