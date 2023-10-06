package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWrongCredential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

		WebElement user = driver.findElement(By.cssSelector("[id=\"user-name\"]"));
		WebElement pass = driver.findElement(By.cssSelector("[id=\"password\"]"));
		WebElement login = driver.findElement(By.cssSelector("[id=\"login-button\"]"));

		user.sendKeys("standard_User");
		pass.sendKeys("secret_sauce");
		login.click();

		WebElement logo = driver.findElement(By.cssSelector("[data-test=\"error\"]"));
		String logotxt = logo.getText();

		if (logotxt.contains("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		driver.close();
	
		
	}

}
