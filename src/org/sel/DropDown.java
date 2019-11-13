package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	WebElement a = driver.findElement(By.xpath("//select[@id='continents']"));
	Select s = new Select(a);
	s.selectByVisibleText("South America");
	
}
}
