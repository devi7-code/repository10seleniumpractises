package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement createBtn=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	createBtn.click();
	Thread.sleep(2000);
	WebElement day=driver.findElement(By.id("day"));
	Select s1=new Select(day);
	s1.selectByValue("1");
	WebElement month=driver.findElement(By.id("month"));
	Select s2=new Select(month);
	s2.selectByVisibleText("Jan");
	WebElement year=driver.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByIndex(0);
	
	driver.quit();
	
}}
