package br.com.oitavo.selenium.waits;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverExplicitAndImplicitWaits {
	WebDriver driver;
	
	@Test
	public void testWebDriverExplicitWaits() {
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("http://www.google.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnK")));
		driver.close();
	}
	
	@Test
	public void testWebDriverImplicitWaits() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement btn = driver.findElement(By.name("btnK"));
		driver.close();
	}
}
