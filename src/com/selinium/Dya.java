package com.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dya {

	public static int pos_Index, team_Index;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-stats/points-table/test/world-test-championship-2021-2023");
		driver.manage().window().maximize();

		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (int i = 0; i < allData.size(); i++) {
			if (allData.get(i).getText().equals("Team")) {
				team_Index = i;
			} else if (allData.get(i).getText().equals("Pos")) {
				pos_Index = i;
			}
		}
		System.out.println("Team Index :"+ team_Index);
		System.out.println("Position Index:"+ pos_Index);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table/tbody/tr"));
		for (int j = 0; j < allRows.size(); j++) {
			List<WebElement> allCol = allRows.get(j).findElements(By.tagName("td"));
			for (int k = 0; k <allCol.size(); k++) {
				if (allCol.get(k).getText().endsWith("India")) {
					String text = allCol.get(pos_Index).getText();
					System.out.println("India Position:"+text);
				}
			}
		}
		}
	}

