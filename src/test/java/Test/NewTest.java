package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public  WebDriver  driver;


	

	  @Test
	  public void f() 
	  {
		  System.setProperty("webdriver.chrome.driver",
					"chromedriver.exe");		
					driver =new ChromeDriver();
					driver.get("https:\\www.google.com");
		
				WebElement search	=driver.findElement(By.xpath ("//input[@title='Search']"));
				search.click();
				search.sendKeys("Om sakthi");
	  }
}
