package com.dice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void firstTestMethod(){
		System.setProperty("webdriver.gecko.driver", "/Users/b002878/Downloads/geckodriver");
		System.setProperty("webdriver.chromedriver", "/Users/b002878/Downloads/chromedriver");
		
		WebDriver driver = new FirefoxDriver();
//		ChromeDriver Cdriver = new ChromeDriver();
//		ChromeOptions chrome = new ChromeOptions();
//		chrome.addArguments("--disable-extensions");
		
		
		
		//Open dice.com
		driver.get("http://www.dice.com");
		
	//	Cdriver.get("http://www.dice.com");
	
		System.out.println("I opened Dice.com");
		
		//Assert.assertEquals(), arg1);
		//Close dice.com
		driver.quit();
		//Cdriver.quit();
		System.out.println("The Driver Should have quit!!!!!");

	}	
	
	
	@Test
	public void secondTestMethod(){
		System.setProperty("webdriver.gecko.driver", "/Users/b002878/Downloads/geckodriver");
		System.setProperty("webdriver.chromedriver", "/Users/b002878/Downloads/chromedriver");
		
		WebDriver driver = new FirefoxDriver();
		//ChromeDriver Cdriver = new ChromeDriver();
		
		
		//Open dice.com
		driver.get("http://www.linkedin.com");
		
		//Cdriver.get("http://www.dice.com");
		
		System.out.println("I opened linkedin.com");

		//Assert.assertEquals(), arg1);
		//Close dice.com
		driver.quit();
		//Cdriver.quit();
		System.out.println("The Driver Should have quit!!!!!");

	}	

}
