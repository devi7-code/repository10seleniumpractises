package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		// is Enabled
		boolean enabled=email.isEnabled();
		System.out.println("1. enabled or not: "+enabled);
		// is Displayed
		boolean displayed=email.isDisplayed();
		System.out.println("2. displayed or not: "+displayed);
		//send keys
		email.sendKeys("Abc@gmail.com");
		// get Attribute
		String data=email.getAttribute("value");
		System.out.println("3. Passed data: "+data);
		//get Attribute
		String attributevalue=email.getAttribute("id");
		System.out.println("4. Attribute Value: "+ attributevalue);
		//clear
		email.clear();
		//send keys
				email.sendKeys("Abc@gmail.com");
				//get Text
				WebElement create_Txt=driver.findElement(By.xpath("//a[text()='Create a Page']"));
				String value=create_Txt.getText();
				System.out.println("5. The text is "+value);
				// click
				WebElement createBtn=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
				Thread.sleep(2000);
				createBtn.click();
				Thread.sleep(2000);
				//is selected
				WebElement genderbtn=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
				genderbtn.click();
				boolean selected=genderbtn.isSelected();
				System.out.println("6. selected or not: "+selected);
				
				
		driver.close();
	}

}

