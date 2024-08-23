package com.asp.webdriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavensProject {

	public static void main(String[] args) {
		
		 //setup chrome driver from selenium web driver 
		WebDriverManager.chromedriver().setup(); 
		// create a new instance of chrome driver class
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		driver.quit();
		

	}

}
