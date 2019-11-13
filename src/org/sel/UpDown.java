package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.toolsqa.com/selenium-webdriver/");
	driver.manage().window().maximize();
	WebElement a= driver.findElement(By.xpath("//h2[contains(text(),'WebDriver')]"));
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].scrollIntoView(true)", a);
	Thread.sleep(5000);
	WebElement b = driver.findElement(By.xpath("//li[contains(text(),'Corporate')]"));
	j.executeScript("arguments[0].scrollIntoView(false)", b);
	Thread.sleep(5000);
	driver.quit();
}
}
