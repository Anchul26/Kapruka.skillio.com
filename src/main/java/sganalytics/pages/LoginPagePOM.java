package sganalytics.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import sganalytics.utils.WaitFor;

public class LoginPagePOM {

	@FindBy(xpath = "//input[@id='Email']")
	WebElement loginEmail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement loginPassword;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement loginBtn;
	
	public void enterUserName(String userName) {
		loginEmail.sendKeys(userName);
	}
	public void clearUserName() {
		loginEmail.clear();
	}
	
	public void enterLoginPassword(String password) {
		loginPassword.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void waitForLoginEmailToBeVisible() {
		WaitFor.elementToBeVisible(By.xpath("//input[@id='Email']"));
	}
	
	
}
