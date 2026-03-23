package sganalytics.com;

import static sourcePackage.Keyword.*;
import static sourcePackage.Keyword.enterText;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.internal.PropertyUtils.*;

import sganalytics.pages.LoginPagePOM;
import sganalytics.utils.App;
import sganalytics.utils.Locator;
import sganalytics.utils.PropUtils;
import sganalytics.utils.WaitFor;
import sourcePackage.BaseClass;
import sourcePackage.Keyword;

public class LoginPage extends BaseClass{

	public String orFile = "./src/main/resources/OR.properties";
	public String appFile = "./src/main/resources/app.properties";
	String env = "qa";
	
	@Test
	public void validLoginToTheApplication() throws IOException {
		PropUtils prop = new PropUtils();
		String loginPageLocatorValue = prop.getProperty(orFile, "loginPage");		
		By loginPageBtn = By.xpath(loginPageLocatorValue); 		
		WaitFor.elementToBeVisible(loginPageBtn);
		clickOn("xPath", loginPageLocatorValue);
	
		//Provide valid login details on login page
		String loginBtnLocatorValue = prop.getProperty(orFile, "loginBtn");
		By loginBtn = By.xpath(loginBtnLocatorValue);
		WaitFor.elementToBeVisible(loginBtn);
		String emailInputLocatorValue = prop.getProperty(orFile, "loginEmail"); 
		enterText("xpath",emailInputLocatorValue,App.getUserName(env));
		String passwordInputLocatorValue = prop.getProperty(orFile, "loginPassword");
		enterText("xpath",passwordInputLocatorValue,App.getPassword(env));
		String loginButtonLocatorValue = prop.getProperty(orFile, "loginBtn");
		clickOn("xpath", loginButtonLocatorValue);
		
	}
	
	@Test
	public void validLoginToTheApplicationUsingPOM() {
		
		By loginPage = By.xpath(Locator.loginPage);
		WaitFor.elementToBeClickable(loginPage);
		clickOn("xpath", Locator.loginPage);		
		LoginPagePOM lgnPage = PageFactory.initElements(Keyword.threadLocal.get(), LoginPagePOM.class);
		lgnPage.waitForLoginEmailToBeVisible();
		lgnPage.enterUserName(App.getUserName("qa"));
		lgnPage.enterLoginPassword(App.getPassword("qa"));
		lgnPage.clickLoginBtn();		
		
	}	
}
