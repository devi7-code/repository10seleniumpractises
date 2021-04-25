package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	driver.switchTo().frame("singleframe");
	WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
	textbox.sendKeys("Single frame opening");
	//default content
	driver.switchTo().defaultContent();
	WebElement iframebtn=driver.findElement(By.xpath("//a[@href='#Multiple']"));
	iframebtn.click();
	WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	WebElement innerframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);
	WebElement textbox1=driver.findElement(By.xpath("//input[@type='text']"));
	textbox1.sendKeys("Multiple frame opening");
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	WebElement videobtn=driver.findElement(By.xpath("//a[text()='Video']"));
	videobtn.click();
	driver.close();
	
	
	
	
	
}}
