package browserScreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screenshots {
	
	public static void driverScreen(WebDriver driver, String name){
		
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShots/"+name+".png"));
		} 
		catch (Exception e) {

			System.out.println("exception msg is "+e.getMessage());
			
		}
		
		
	}

}
