package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestOpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:google.com/");
driver.findElement(By.name("q")).sendKeys("rajani thite");
driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
driver.close();
}

}
