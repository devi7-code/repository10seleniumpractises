package com.selenium.tasks;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class ActionsTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement dressesbtn=driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(dressesbtn).build().perform();
		WebElement evgdressesbtn=driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		action.moveToElement(evgdressesbtn).build().perform();
		action.click(evgdressesbtn).build().perform();
		driver.close();
	}
}
