package com.selenium.tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sigin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//1st tab
		WebElement sigin=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sigin.click();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("deviqq@gmail.com");
		WebElement password=driver.findElement(By.id("passwd"));
		password.sendKeys("password");
		WebElement SubmitLogin=driver.findElement(By.id("SubmitLogin"));
		SubmitLogin.click();
		
		WebElement email_create=driver.findElement(By.id("email_create"));
		email_create.sendKeys("devip@gmail.com");
		WebElement SubmitCreate=driver.findElement(By.id("SubmitCreate"));
		SubmitCreate.click();
		SubmitCreate.click();
		
		WebElement radio=driver.findElement(By.id("id_gender1"));
		radio.click();
		WebElement firstnamecreate=driver.findElement(By.id("customer_firstname"));
		firstnamecreate.sendKeys("dev");
		WebElement lastnamecreate=driver.findElement(By.id("customer_lastname"));
		lastnamecreate.sendKeys("i");
		WebElement passwordcreate=driver.findElement(By.xpath("//input[@type='password']"));
		passwordcreate.sendKeys("password");
		WebElement day=driver.findElement(By.id("days"));
		Select s1=new Select(day);
		s1.selectByValue("7");
		WebElement month=driver.findElement(By.id("months"));
		Select s2=new Select(month);
		s2.selectByValue("10");
		WebElement year=driver.findElement(By.id("years"));
		Select s3=new Select(year);
		s3.selectByValue("1995");
		WebElement firstname=driver.findElement(By.id("firstname"));
		firstname.sendKeys("dev");
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys("i");
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys("575 Market St");
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("San Francisco");
		WebElement state=driver.findElement(By.id("id_state"));
		Select s=new Select(state);
		s.selectByValue("5");
		WebElement postcode=driver.findElement(By.id("postcode"));
		postcode.sendKeys("94102");
		WebElement phone_mobile=driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("415-701-2311");
		WebElement alias=driver.findElement(By.id("alias"));
		alias.sendKeys("r@gmail.com");
		
		WebElement submitAccount=driver.findElement(By.id("submitAccount"));
		submitAccount.click();
		WebElement logout=driver.findElement(By.xpath("//a[@title='Log me out']"));
		logout.click();
		
		WebElement emailsignin=driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		emailsignin.sendKeys("devip@gmail.com");
		WebElement passwordsignin=driver.findElement(By.xpath("(//input[@name='passwd'])[1]"));
		passwordsignin.sendKeys("password");
		WebElement SubmitLoginsignin=driver.findElement(By.xpath("(//button[@name='SubmitLogin'])[1]"));
		SubmitLoginsignin.click();
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		driver.close();
	}
}

