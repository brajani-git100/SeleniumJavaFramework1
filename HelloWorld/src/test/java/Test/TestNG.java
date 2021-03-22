package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver=null;
@BeforeTest
	
	public void setUp() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chrome\\chromedriver.exe");
driver=new ChromeDriver();
	}
@Test
	public void googleSearch() {
driver.get("https:google.com/");
driver.findElement(By.name("q")).sendKeys("rajani thite");
driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	}
@AfterTest
public void TearDownTest() {
driver.close();
driver.quit();
System.out.println("Test Run Successifully");
}
}


