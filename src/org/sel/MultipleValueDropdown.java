package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement multi = driver.findElement(By.id("selenium_commands"));
		Select s = new Select(multi);
		List<WebElement> opt = s.getOptions();
		for (WebElement x : opt) {
			String t = x.getText();
			System.out.println(t);
			if ((t.equals("Browser Commands")) || (t.equals("Switch Commands")) || (t.equals("Wait Commands"))) {
				s.selectByVisibleText(t);
			}
		}
		System.out.println();
		System.out.println("Get All Selected Options");
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement y : all) {
			String t = y.getText();
			System.out.println(t);
		}
		System.out.println();
		System.out.println("Get First Selected Option");
		WebElement first = s.getFirstSelectedOption();
		String t = first.getText();
		System.out.println(t);
		s.deselectByVisibleText("Switch Commands");
		boolean n = s.isMultiple();
		System.out.println(n);
		driver.quit();
	}
}
