import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://google.com/");
//WebElement textBox=driver.findElement(By.xpath("//input[@name='q']"));
//textBox.sendKeys("rajani thite");

list<WebElement> listOfInputElements =driver.findElements(By.xpath("//input"));
listOfInputElements.si
driver.close();
	}

}
