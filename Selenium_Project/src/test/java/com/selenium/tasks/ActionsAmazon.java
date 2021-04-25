package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		//1st tab
		WebElement Mobilesbtn=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Mobilesbtn.click();
		WebElement Mobilesaccessories=driver.findElement(By.xpath("(//a[@class='nav-a nav-hasArrow'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(Mobilesaccessories).build().perform();
		Thread.sleep(2000);
		WebElement casescovers=driver.findElement(By.xpath("//a[text()='Cases & Covers']"));
		action.moveToElement(casescovers).build().perform();
		action.click(casescovers).build().perform();
		//2nd tab
		WebElement cameras=driver.findElement(By.xpath("(//a[@class='nav-a nav-hasArrow'])[5]"));
		action.moveToElement(cameras).build().perform();
		Thread.sleep(2000);
		WebElement camcorders=driver.findElement(By.xpath("//a[text()='Camcorders']"));
		action.moveToElement(camcorders).build().perform();
		action.click(camcorders).build().perform();
		//3rd tab
		WebElement Fashion=driver.findElement(By.xpath("//a[text()='Fashion']"));
		Fashion.click();
		WebElement women=driver.findElement(By.xpath("(//a[@class='nav-a nav-hasArrow'])[1]"));
		action.moveToElement(women).build().perform();
		Thread.sleep(2000);
		WebElement sarees=driver.findElement(By.xpath("//a[text()='Sarees']"));
		action.moveToElement(sarees).build().perform();
		action.click(sarees).build().perform();
		//4th tab
		WebElement men=driver.findElement(By.xpath("(//a[@class='nav-a nav-hasArrow'])[2]"));
		action.moveToElement(men).build().perform();
		Thread.sleep(2000);
		WebElement shirts=driver.findElement(By.xpath("//a[text()='Shirts']"));
		action.moveToElement(shirts).build().perform();
		action.click(shirts).build().perform();
		
		
		
		driver.close();
	}
}

