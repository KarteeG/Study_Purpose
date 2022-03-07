package com.selinium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	
	public static int Position_Index,Team_Index;
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver1//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.cricbuzz.com/cricket-stats/points-table/test/world-test-championship-2021-2023");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (int i = 0; i < allData.size(); i++) {
			if (allData.get(i).getText().equals("Team")) {
				
				Team_Index = i;
			}
			else if (allData.get(i).equals("Pos")) {
				
				Position_Index =i;
			}
		}
		System.out.println("Team Index:"+ Team_Index);
		System.out.println("Position Index:"+Position_Index);
		
		List<WebElement> all_Rows = driver.findElements(By.xpath("//table/tbody/tr"));
		for (int i = 0; i < all_Rows.size(); i++) {
			List<WebElement> all_Data = all_Rows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < all_Data.size(); j++) {
					if (all_Data.get(j).getText().equals("India")) {
						String text = all_Data.get(Position_Index).getText();
						System.out.println("India Postion:"+ text);
				}
			}
		}
		
		driver.close();
	}

}
