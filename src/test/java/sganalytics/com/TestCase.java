package sganalytics.com;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import sganalytics.utils.Locator;
import sganalytics.utils.WaitFor;
import sourcePackage.BaseClass;

public class TestCase extends BaseClass {
	
	//@Test
	/*public void verifyIfUserCreatedOrNot() throws InterruptedException {
		//Login
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add Employee')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
		Random random = new Random();
        int num = random.nextInt(9000) + 1000;
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gayatri_"+num);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Dhondi_"+num);
		driver.findElement(By.xpath("//div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]/div/div/div[2]/input")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")));
		driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")).sendKeys("Gayatri");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		
		//validation of newly added User (Present or not)
		
		//rows --> //div[@class='oxd-table-body']/div
		//column --> //div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[3]
	} */
	
	@Test
	public void nopCommerceSignUpUsingKeywords(){
		By firstname = By.xpath(Locator.firstName);
		WaitFor.elementToBeVisible(firstname);
		
		
	}

}
