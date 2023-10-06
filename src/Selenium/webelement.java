package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebElement
		//WebElement in selenium is essentially an HTML element on a webside.
		
		//Testcase1
		
		//arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
		//action
//        WebElement ele=driver.findElement(By.cssSelector("#user-name"));
//        ele.sendKeys("standard_user");
//        WebElement ele2=driver.findElement(By.cssSelector("#password"));
//        ele2.sendKeys("secret_sauce");
//        WebElement ele3=driver.findElement(By.cssSelector("#login-button"));
//        ele3.click();
        
        
		//assertion
//        WebElement ele4=driver.findElement(By.cssSelector(".app_logo"));
//        boolean flag =ele4.isDisplayed();
//        if(flag) {
//        System.out.println("Testcase1 pass");
//        }
//        else {
//        	System.out.println("Testcase1 fail");
//        }
//        driver.close();

        
        //Testcase2
        //Action
        
        WebElement ele=driver.findElement(By.cssSelector("#user-name"));
        ele.sendKeys("standard_user");
        WebElement ele2=driver.findElement(By.cssSelector("#password"));
        ele2.sendKeys("secret_sauce");
        WebElement ele3=driver.findElement(By.cssSelector("#login-button"));
        ele3.click();
        WebElement ele4=driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
        String expectedText=ele4.getText();
        System.out.println(expectedText);
        
        if(expectedText.contains("Epic sadface:Username and password do not match any user in this service")) {
        	System.out.println("Test case 2 pass");
       }
        else {
        	System.out.println("Test case 2 fail");
        }
        driver.close();

        

        

       
		
		
		
		
		
		
		
		
		
	}

}
