package org.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Launch extends BaseClass{
public static void main(String[] args) throws IOException {
	LaunchBrowser("https://www.facebook.com/");
	screenShot("F:\\SS\\Before.png");
	WebElement e=driver.findElement(By.name("email"));
	type(e,"CSN");
	WebElement p=driver.findElement(By.name("pass"));
	type(p,"CCC");
	screenShot("F:\\SS\\after.jpeg");
	WebElement f1 = driver.findElement(By.xpath("//input[@name='firstname']"));
	type(f1,"ZZZ");
	WebElement f2 = driver.findElement(By.xpath("//input[@name='lastname']"));
	type(f2,"ASD");
	screenShot("F:\\SS\\afterA.jpeg");
	WebElement c = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
	click(c);
	screenShot("F:\\SS\\afterB.jpeg");
	closeBrowser();
}
}
