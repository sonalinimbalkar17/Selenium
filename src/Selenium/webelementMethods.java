package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		WebElement contactE =	driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		
		// isDisplayed()
		boolean a = contactE.isDisplayed();
		
		if(a) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		// getText()
		if(contactE.getText().equals("CONTACT US")) {
			System.out.println("Testcase pass 2");
		}
		else {
			System.out.println("Testcase Fail 2");
		}
		
		//sendKeys();
		WebElement firstName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		WebElement lastName = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement email = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement submitButton = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
		
		// clear
		//firstName.clear();
		
		//click()
//		firstName.sendKeys("sonali");
//		lastName.sendKeys("nimbalkar");
//		email.sendKeys("sonalinimbalkar12@gmail.com");
//		message.sendKeys("learning new things");
//		submitButton.click();
//	
		
		// submit()
		firstName.sendKeys("sonali");
		lastName.sendKeys("nimbalkar");
		email.sendKeys("sonalinimbalkar12@gmail.com");
		message.sendKeys("learning new things");
		submitButton.click();
	
		
		// click() , sendKeys() , clear() , submit() , isDisplayed() , getText();

        
        
        
        
        
        
	}
	}