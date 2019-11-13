package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropaa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
		WebElement multi = driver.findElement(By.xpath("//select[@name='dyna(nativeDistrict)']"));
		Select opt = new Select(multi);
		List<WebElement> l = opt.getOptions();
		for (WebElement w : l) {
			String x = w.getText();
			System.out.println(x);
			
		}
		driver.quit();
	}
}
