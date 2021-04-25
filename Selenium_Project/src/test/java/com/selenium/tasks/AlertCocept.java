package com.selenium.tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCocept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//accept alert
		WebElement alertBtn1accept=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertBtn1accept.click();
		Alert simple_alert=driver.switchTo().alert();
		simple_alert.accept();
		// dismiss alert
		WebElement alertBtn2box=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertBtn2box.click();
		WebElement alertBtn2dismiss=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		alertBtn2dismiss.click();
		Alert confirm_alert=driver.switchTo().alert();
		confirm_alert.dismiss();
		//prompt alert
		WebElement alertBtn3box=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		alertBtn3box.click();
		WebElement alertBtn3prompt=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		alertBtn3prompt.click();
		Alert prompt_alert=driver.switchTo().alert();
		prompt_alert.sendKeys("devi");
		prompt_alert.accept();
		
		driver.close();
	}
}
