package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Colors_WebElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		String color = searchTextBox.getCssValue("background-color");
		System.out.println("Color is : " + color);
		String font = searchTextBox.getCssValue("font-size");
		System.out.println("Font is : " + font);
		driver.quit();

	}
}
