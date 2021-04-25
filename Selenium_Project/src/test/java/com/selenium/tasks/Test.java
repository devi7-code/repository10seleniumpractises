package com.selenium.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "V:\\greetech\\Selenium_Project\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
String title1=driver.getTitle();
System.out.println("Title Of Google is"+title1);
String CurrentUrl1=driver.getCurrentUrl();
System.out.println("Current Url Of Google is"+CurrentUrl1);
driver.navigate().to("https://www.amazon.in/");
String title2=driver.getTitle();
System.out.println("Title of Amazon is"+title2);
String CurrentUrl2=driver.getCurrentUrl();
System.out.println("Current Url Of Amazon is"+CurrentUrl2);
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
		driver.quit();
	}
}
