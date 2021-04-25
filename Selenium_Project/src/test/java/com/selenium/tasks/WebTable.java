package com.selenium.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		//All Data
		System.out.println("**********All DATA**********");
		List<WebElement> allData=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement data:allData) {
			String text=data.getText();
			System.out.println(text);
		}
		
		//Row Data
				System.out.println("**********Row DATA**********");
				List<WebElement> RowData=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
				for(WebElement data:RowData) {
					String text=data.getText();
					System.out.println(text);
				}
				//Column Data
				System.out.println("**********Col DATA**********");
				List<WebElement> ColData=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
				for(WebElement data:ColData) {
					String text=data.getText();
					System.out.println(text);
				}
				//Particular data
				System.out.println("**********Particular DATA**********");
				List<WebElement> ParticularData=driver.findElements(By.xpath("//table/tbody/tr[1]/td[1]"));
				for(WebElement data:ParticularData) {
					String text=data.getText();
					System.out.println(text);
				}	
				//Header Data
				System.out.println("**********Header DATA**********");
				List<WebElement> HeaderData=driver.findElements(By.xpath("//table/thead/tr/th"));
				for(int i=0; i<HeaderData.size(); i++) {
					String text=HeaderData.get(i).getText();
					System.out.println(text);
				}
	}

}
