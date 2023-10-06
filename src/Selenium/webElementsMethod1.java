package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementsMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//        
//		// getText()
//       WebElement q1= driver.findElement(By.cssSelector("h1"));
//       String actual = q1.getText();
//       String expected = "Dropdown Menu(s), Checkboxe(s) & Radio Button(s)";
//		if(actual.equals(expected)) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
//
//		// isDisplayed()
//		if(q1.isDisplayed()) {
//			System.out.println("test case2 pass");
//		}
//		else {
//			System.out.println("test case2 fail");
//		}
//        
//		// isSelected() // click()
//		WebElement q2 = driver.findElement(By.cssSelector("input[value=\"green\"]"));
//		q2.click();
//		if(q2.isSelected()) {
//			System.out.println("test case3 pass");
//		}
//		else {
//			System.out.println("test case3 fail");
//		}
//		
//		// isEnabled()
//		WebElement q3 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]"));
//		if(q3.isEnabled()) {
//			System.out.println("test case4 pass");
//		}
//		else {
//			System.out.println("test case4 fail ");
//		}
//		
//		// getSize()
//		WebElement q4 = driver.findElement(By.cssSelector("div[class=\"thumbnail\"]"));
//		Dimension heightWeight = q4.getSize();	
//		driver.manage().window().maximize();
//		System.out.println(heightWeight);
//		System.out.println(q1.getSize());
//		
//		// getAttribute()
//		WebElement q5 = driver.findElement(By.id("main-header"));
//		String classValue = q5.getAttribute("class");
//		System.out.println(classValue);
//		
//		
//		//getCssValue()
//		String fontSizeValue = q1.getCssValue("font-size");
//		System.out.println(fontSizeValue);
//		
//		
//		// getTagName()
//		String tg = q1.getTagName();
//		System.out.println(tg);
//		
//		
		//sendKeys() // clear()
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		//input[name= "first_name"]
		
		WebElement q6 = driver.findElement(By.cssSelector("input[name= \"first_name\"]"));
		q6.sendKeys("sonali");
		q6.clear();
	

	driver.close();
		
		
		
	


		
		
		
		
	}

}
