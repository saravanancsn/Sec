package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement e = driver.findElement(By.id("email"));
	boolean dis =e.isDisplayed();
	System.out.println("Displayed"+dis);
	boolean ena =e.isEnabled();
	System.out.println("Enabled"+ena);
	JavascriptExecutor j = (JavascriptExecutor) driver;
	WebElement m=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	j.executeScript("arguments[0].click()", m);
	Thread.sleep(5000);
	boolean s1 = m.isSelected();
	System.out.println("Selected"+s1);
	WebElement f = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	boolean s2 = f.isSelected();
	System.out.println("Selected"+s2);
	driver.quit();
}
}
