package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("Abc@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Abc");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement create_Txt=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String value=create_Txt.getText();
		System.out.println("The text is "+value);
		driver.close();
	}

}
