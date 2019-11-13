package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GettyImg {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.gettyimages.in/");
	driver.manage().window().maximize();
	WebElement a = driver.findElement(By.xpath("//div[contains(text(),'Creative Images')]"));
	Select s = new Select(a);
	s.selectByVisibleText("Video");
}
}
