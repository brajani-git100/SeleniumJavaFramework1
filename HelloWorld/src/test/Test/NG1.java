package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NG1 {
	System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
public String baseUrl = "http://demo.guru99.com/test/newtours/";
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching chrome browser"); 
     
      
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
}
