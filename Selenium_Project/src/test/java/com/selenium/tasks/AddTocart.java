package com.selenium.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddTocart {
static WebDriver driver;
static WebElement evgdressesbtn;
static WebElement summerdress;


	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement sigin=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sigin.click();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("devip@gmail.com");
		WebElement password=driver.findElement(By.id("passwd"));
		password.sendKeys("password");
		WebElement SubmitLogin=driver.findElement(By.id("SubmitLogin"));
		SubmitLogin.click();
		evgdressesbtn=driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		String women1pic="//a[@title='Printed Dress']";
		String paybybank="//a[@title='Pay by bank wire']";
		String quickview1="//a[@class='quick-view']";
		selection(evgdressesbtn, women1pic,paybybank,quickview1);
		summerdress=driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
		String women2pic="(//a[@title='Printed Summer Dress'])[3]";
		String paybycheck="//a[@title='Pay by check.']";
		String quickview2="(//a[@class='quick-view'])[2]";
		selection(summerdress, women2pic,paybycheck,quickview2);
		
		
		driver.close();
	}
		public static void selection(WebElement dress,String pic, String pay, String view) throws InterruptedException {
		WebElement dressesbtn=driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(dressesbtn).build().perform();
		Thread.sleep(1000);
		action.moveToElement(dress).build().perform();
		action.click(dress).build().perform();
		WebElement selectpic=driver.findElement(By.xpath(pic));
		action.moveToElement(selectpic).build().perform();
		WebElement viewing=driver.findElement(By.xpath(view));
		action.moveToElement(viewing).build().perform();
		action.click(viewing).build().perform();
		driver.switchTo().frame(0);		
		
		WebElement plus=driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		action.moveToElement(plus).build().perform();
		action.click(plus).build().perform();		
		plus.click();
		WebElement topsize=driver.findElement(By.id("group_1"));
		Select s=new Select(topsize);
		s.selectByValue("2");
		WebElement color=driver.findElement(By.xpath("//ul[@id='color_to_pick_list']/li[2]"));
		color.click();
		WebElement addtocart=driver.findElement(By.xpath("//button[@name='Submit']"));
		addtocart.click();
		Set<String> all_id=driver.getWindowHandles();
		int size=all_id.size();
		System.out.println(size);
		for(String id: all_id) {
		String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			driver.switchTo().window(id);
			Thread.sleep(5000);
		}
		WebElement proceed=driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceed.click();
		//
		WebElement checkout=driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		checkout.click();
		WebElement address=driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		address.click();
		driver.findElement(By.id("cgv")).click();
		WebElement shipping=driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		shipping.click();
		//pay
		WebElement payment=driver.findElement(By.xpath(pay));
		payment.click();
		//confirm pay
		WebElement confirm=driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirm.click();
		//orders
		WebElement back=driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back.click();
		}
		
		
		
		
}
		
		
	