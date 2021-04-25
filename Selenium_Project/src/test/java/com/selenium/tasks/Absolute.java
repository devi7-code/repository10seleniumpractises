package com.selenium.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Absolute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement seemore=driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/a[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(seemore).build().perform();
		action.click(seemore).build().perform();
		
		Thread.sleep(1000);
		WebElement ac=driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
		action.moveToElement(ac).build().perform();
		action.click(ac).build().perform();
		Thread.sleep(1000);
		
		WebElement voltas=driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ol[1]/li[1]/div[1]/a[1]"));
		action.moveToElement(voltas).build().perform();
		action.click(voltas).build().perform();
		Thread.sleep(1000);
		
		WebElement rating=driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[4]/div[4]/div[4]/div[5]/div[1]/span[3]/a[1]"));
		action.moveToElement(rating).build().perform();
		action.click(rating).build().perform();
		Thread.sleep(1000);
		
		
		
		driver.close();
	}
}
