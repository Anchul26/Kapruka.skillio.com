package sganalytics.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sourcePackage.Keyword;

/**
 * This class contains all the wait related keywords. It will have all the methods
 * which will wait for the elements to be visible, clickable etc.
 */
public class WaitFor {
	static WebDriverWait wait;
	/**
	 * This is a static block which will be executed when the class is loaded in the memory.
	 */
	static {
		wait = new WebDriverWait(Keyword.threadLocal.get(), Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);
	}

	/**
	 * This is private constructor to prevent the object creation of this class
	 * because all the methods in this class are static and we won't be want to create
	 * the object of this class.
	 */
	private WaitFor() {
	
	}
	
	public static void elementToBeVisible(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public static void elementToBeClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void stalenessOfElement(By element) {
		wait.until(ExpectedConditions.stalenessOf((WebElement) element));
	}
	

}
