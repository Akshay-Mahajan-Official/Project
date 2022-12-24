package TestBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constant.AppConstant;
import Utility.PropertiesReader;

public class Base {

	public static WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		String browsername = PropertiesReader.getValue("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", AppConstant.getChromepath());
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		}
		driver.manage().window().maximize();
		driver.get(PropertiesReader.getValue("application.url"));
		return driver;
	}
	

}
