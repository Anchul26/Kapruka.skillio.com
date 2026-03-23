package sganalytics.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import sganalytics.utils.Locator;
import sganalytics.utils.WaitFor;
import sourcePackage.BaseClass;
import static sourcePackage.Keyword.*;
/** This class contains test cases for SignUp menu of NopCommerce application
 * The app url is https://demo.nopcommerce.com/register?returnUrl=%2Fcart
 * 
 */


public class SignUpNopCommerce extends BaseClass {
	/**
	 * This test case is to check signup functionality with valid credentials using Keyword.
	 */
	@Test
	public void nopCommerceSignUpUsingKeywords(){
		By signup = By.xpath(Locator.signUpPage);
		WaitFor.elementToBeVisible(signup);
		clickOn("xpath", Locator.signUpPage);
		By firstname = By.xpath(Locator.firstName);
		WaitFor.elementToBeVisible(firstname);
		enterText("Xpath",Locator.firstName,"Anchul");
		enterText("Xpath", Locator.lastName, "Jamadar");
		enterText("xpath", Locator.email, "achulshing.jamadar@gmail.com");
		clickOn("Xpath",Locator.male);
		clickOn("xpath", Locator.newsLetter);
		enterText("xpath", Locator.password, "Dhondi@123");
		enterText("xpath", Locator.confirmPassword, "Dhondi@123");
		clickOn("Xpath", Locator.registerbtn);		
	}
	

}
