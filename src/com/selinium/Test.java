package com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u\\eclipse-workspace\\Study_Purpose\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_d']"));
		String attribute = gmail.getAttribute("class");
		System.out.println(attribute);
		String attribute3 = gmail.getAttribute("gb_d");
		System.out.println(attribute3);
		gmail.click();
		
		WebElement singnin = driver.findElement(By.xpath("//a[@href=\"https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser\"]"));
		singnin.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ka@gmail.com");
		String attribute2 = email.getAttribute("value");
		System.out.println(attribute2);
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
