package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

		
		// WebDriver --- interface ---->  implements ChromeDriver
        
        // get()
		// getCurrentUrl()
		// findElement()
		// findElements()
		// getTitle()
		// driver.close()
		// driver.quit()
		
        
        //get()  ---launch a new browser and open the URL in browser
          driver.get("https://www.saucedemo.com/");
         
        //findElement()
          driver.findElement(By.id("user-name")).sendKeys("standard_user");
          driver.findElement(By.id("password")).sendKeys("secret_sauce");
          driver.findElement(By.id("login-button")).click();
        
		//getCurrentUrl()
         String url= driver.getCurrentUrl();
         if(url.contains("inventory")) {
        	 System.out.println("Test case Pass");
         }
        
		 // findElement() ---first element within the current web page by using given locator
           WebElement e= driver.findElement(By.cssSelector(".login_logo")) ;
           
         // findElements()---all elements
          List<WebElement> eles = driver.findElements(By.cssSelector("input")) ;
          
     	 // getTitle()---to retrieve the title of the webpage the user currently working on
     		String title=driver.getTitle();
     		if(title.equals("Swag Labs")) {
     			System.out.println("Testcase pass");
     		}
     		else {
     			System.out.println("Testcase fail");
     		}
     		
    	// driver.quit()---will closes all the browsers
     		
    	// driver.close()--- is used to close the current browser window

System.out.println("hello");
        
	}

	
	

}
