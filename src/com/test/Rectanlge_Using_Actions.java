package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rectanlge_Using_Actions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		Actions a = new Actions(driver);
		
		
	}
	

}
