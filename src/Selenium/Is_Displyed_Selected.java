package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displyed_Selected {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/r.php?locale=en_GB");
        
        //isDisplayed();---->image
        //display logo---?
        boolean display=driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']")).isDisplayed();
        
        if(display==true) {
        	System.out.println("logo is displayed");//logo id displayed
        }
        else {
        	System.out.println("logo is not available");
        }
        
        //isEnabled()---  >link         
        //enabled link---?
        boolean enabled=driver.findElement(By.xpath("//a[@class='_9bq5']")).isEnabled();
        if(enabled==true) {
        	System.out.println("link is available");//link is available
        }
        else {
        	System.out.println("link is not available");
        
        }
        
        
        //isSelected()---->clickble
      
        //driver.findElement(By.xpath("//input[@value='2']")).click();
        
        boolean selected=driver.findElement(By.xpath("//input[@value='2']")).isSelected();
        
        if(selected==true) {
        	System.out.println(" is selected");
        }
        else {
        	System.out.println(" is not selected");//is not selected
        
        }
		
		
	}

}
