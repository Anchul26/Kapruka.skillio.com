package sourcePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import sganalytics.utils.App;

import static sourcePackage.Keyword.*;

public class BaseClass {
	
	//public RemoteWebDriver driver;
	String appURL= "https://demo.nopcommerce.com/register?returnUrl=%2Fcart";
	//Keyword keyword = new Keyword();
	@BeforeMethod
	public void setup(){
		
		openBrowser(App.getBrowserName());
		launchUrl(App.getUrl("qa"));
		threadLocal.get().manage().window().maximize();
	}
	
	@AfterMethod
	public void logout() {
		threadLocal.get().quit();
		System.out.println("Driver quite successfully....!");
	}
}
