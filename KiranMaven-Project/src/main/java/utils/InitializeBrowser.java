package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitializeBrowser {
	static WebDriver driver;
	public static WebDriver OpenDriver(String browser){
		
		if (browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		
	}

		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("chrome.browser.driver", "//path");
			driver=new ChromeDriver();
		
	}	
		
		if (browser.equalsIgnoreCase("ie")){
			System.setProperty("ie.browser.driver", "//path");
			driver=new InternetExplorerDriver();
		
	}
		return driver;
		
		
}
}
