package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
       // driver.get("http://www.webdriveruniversity.com/");
        
        //getTitle()
//       String title= driver.getTitle();
//       if(title.equals("WebDriverUniversity.com")) {
//    	   System.out.println("Test case Pass");
//       }
        
        //get()
        driver.get("https://www.saucedemo.com/");
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        //getCurrenturl()
        
       String currentUrl= driver.getCurrentUrl();
       if(currentUrl.contains("inventory")) {
    	   System.out.println("Test case Pass");
       }
       else {
    	   System.out.println("Test case fail");
       }
        
       //findElement()
       
      WebElement ele= driver.findElement(By.id("class=\"login_logo\""));
      if(ele.isDisplayed()) {
    	  System.out.println("Test case Pass");
      }
      else {
    	  System.out.println("Test case fail");
      }
       

		// findElements 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List <WebElement> eles = driver.findElements(By.className("inventory_item_name"));
		if(eles.size() == 6) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		for(int i = 0 ; i < eles.size() ; i++) {
			System.out.println(eles.get(i).getText());
		}
		
		// driver.close()
		// closes the current browser handled by automation
		
		
		// driver quit()
		// closes the all the browser handled by automation
		
		
		
       
       
       
	}

}
