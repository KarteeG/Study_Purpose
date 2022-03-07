package com.selinium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dynamic_Webtable {
	
	public static int team_Index, position_Index;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.cricbuzz.com/cricket-stats/points-table/test/world-test-championship-2021-2023");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> all_Headers = driver.findElements(By.xpath("//table/thead/tr/td"));
		
		for (int i = 0; i < all_Headers.size(); i++) {
			
			if (all_Headers.get(i).getText().equals("Team")) {
				
				team_Index =i;
			}
			else if (all_Headers.get(i).getText().equals("POS")) {
				position_Index =i;
			}
			
		}
		System.out.println("Team Index:"+  team_Index);
		System.out.println("Position Index:"+ position_Index);
		
		List<WebElement> all_Rows = driver.findElements(By.xpath("//table/tbody/tr"));
		for (int i = 0; i < all_Rows.size(); i++) {
			List<WebElement> all_Data = all_Rows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < all_Data.size(); j++) {
					if (all_Data.get(j).getText().equals("India")) {
						String text = all_Data.get(position_Index).getText();
						System.out.println("India Postion:"+ text);
					}
				}
		}
		driver.close();
	}

}
