package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	static WebDriver driver;
public static void LaunchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get(url);
}public static void type(WebElement l,String i) {
    l.sendKeys(i);
}public static void click(WebElement l) {
	l.click();
}
public static void closeBrowser() {
	driver.quit();
}public static void screenShot(String path) throws IOException {
	TakesScreenshot t = (TakesScreenshot) driver;
	File s = t.getScreenshotAs(OutputType.FILE);
	File d = new File(path);
	FileUtils.copyFile(s, d);
}
}
