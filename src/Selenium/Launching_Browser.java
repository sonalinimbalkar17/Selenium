package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        
	}

}
