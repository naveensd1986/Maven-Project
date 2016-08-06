package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestA 
{
 @Test
 public void testTestA()
 {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.co.in");
	 driver.manage().window().maximize();
	 driver.close();
 }
}
