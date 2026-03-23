package sganalytics.utils;

/**
 * This interface contains all the locators of application. We are using 
 * interface because we want to achieve abstraction and we don't want to create
 * the object of this class. We are declaring all the locators as public static
 * final because we want to access them from anywhere in the code and we don't want 
 * to change their values.
 * write all the locators of the application in this interface and use them in the test
 * @author Lenovo
 */
public interface Locator {
	
	String firstName = "//input[@name='FirstName']";
	String lastName = "//input[@name='LastName']";
	String email = "//input[@name='Email']";
	String male = "//input[@id='gender-male']";
	String female = "//input[@id='gender-female']";
	String newsLetter = "//input[@id='NewsLetterSubscriptions_0__IsActive']";
	String password = "//input[@id='Password']";
	String confirmPassword = "//input[@id='ConfirmPassword']";
	String registerbtn = "//button[@id='register-button']";
	String signUpPage = "//a[@class='ico-register']";
	
	String loginPage = "//a[@class='ico-login']";
	String loginEmail = "//input[@id='Email']";
	String loginPassword = "//input[@id='Password']";
	String loginBtn = "//button[@class='button-1 login-button']";
	
}