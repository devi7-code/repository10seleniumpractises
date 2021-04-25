package com.selenium.tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "V:\\greetech\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Abc@gmail.com");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Abc");
		Thread.sleep(2000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("V:\\greetech\\Selenium_Project\\ScreenShot\\Snap1.png");
		FileUtils.copyFile(source, destination);
		WebElement login_Btn=driver.findElement(By.name("login"));
		login_Btn.click();
		Thread.sleep(2000);
		File source1=ts.getScreenshotAs(OutputType.FILE);
		File destination1=new File("V:\\greetech\\Selenium_Project\\ScreenShot\\Snap2.png");
		FileUtils.copyFile(source1, destination1);
		driver.close();
		
	}

}
