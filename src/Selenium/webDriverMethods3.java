package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://www.webdriveruniversity.com/");
        driver.findElement(By.cssSelector("#contact-us")).click();
        
        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        
        Set <String>windowIds=driver.getWindowHandles();
        System.out.println(windowIds);
        
   
		for(String id:windowIds) {
			System.out.println(id);
			if(id != parentWindow) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		boolean ele = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2")).isDisplayed();
		System.out.println(ele);
	
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	
        
        
        
		
		
		
		
	}

}
