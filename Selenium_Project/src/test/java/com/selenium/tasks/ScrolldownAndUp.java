package com.selenium.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolldownAndUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		//accept alert
		WebElement amazonlogo=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", amazonlogo);
		
		//scroll up
		WebElement chocolatetext=driver.findElement(By.xpath("//h2[text()='Chocolates, sweets & more']"));
		
		js.executeScript("arguments[0].scrollIntoView();", chocolatetext);
		
		driver.close();
	}
}
