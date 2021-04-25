package com.selenium.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowAmazon {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://amazon.in");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	Robot r=new Robot();
	//1st tab
	WebElement Mobilesbtn=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	action.contextClick(Mobilesbtn).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//2nd tab
	WebElement Fashion=driver.findElement(By.xpath("//a[text()='Fashion']"));
	
	action.contextClick(Fashion).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//3rd tab
	WebElement TodayDeals=driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	
	action.contextClick(TodayDeals).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//4th tab
	
			WebElement NewReleases=driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
			
			action.contextClick(NewReleases).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	
	Set<String> all_id=driver.getWindowHandles();
	for(String id: all_id) {
		String title=driver.switchTo().window(id).getTitle();
		System.out.println(title);
	}
	String actualtitle="Amazon.in Today's Deals: Great Savings. Every Day.";
	for(String id:all_id) {
		if(driver.switchTo().window(id).getTitle().equals(actualtitle)) {
			break;
		}
	}
	driver.close();
}
}


