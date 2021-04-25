package com.selenium.tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement multiple_DD=driver.findElement(By.id("multi-select"));
		Select s=new Select(multiple_DD);
		//IS MULTIPLE
		boolean multiple=s.isMultiple();
		System.out.println("Multiple or not" +multiple);
		// get Options
		System.out.println("****ALL OPTIONS***********************");
		List<WebElement> all_options=s.getOptions();
		for(WebElement options: all_options) {
			System.out.println(options.getText());
		}
		int size=all_options.size();
		System.out.println("Size: "+size);
		// multiple values
		int n=1;
		for(int i=0;i<size;i++) {
			
			if(n%2==0) {
				s.selectByIndex(i);
			}
			n++;
		}
			//get all selected options
			System.out.println("*****SELECTED OPTION******************");
			List<WebElement> all_selectedoptions=s.getAllSelectedOptions();
			for(WebElement selected_option: all_selectedoptions) {
				System.out.println(selected_option.getText());
				
			}
		// get first selected option
			System.out.println("*****FIRST SELECTED OPTION******************");
			List<WebElement> all_firstselectedoptions=s.getAllSelectedOptions();
			for(WebElement firstselected_option: all_firstselectedoptions) {
				
				if(firstselected_option.getText().equals("Texas")) {
					System.out.println("First option: "+firstselected_option.getText());
				}
			}
			
			driver.close();
		
	}
}
