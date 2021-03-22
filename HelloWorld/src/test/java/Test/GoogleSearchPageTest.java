package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googlesearchPage();
	}
public static void googlesearchPage() {
	System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
GoogleSearchPageObjects searchPageObject=new GoogleSearchPageObjects(driver);
driver.get("https:google.com/");
searchPageObject.settestInSearchBox("rajani thite");
searchPageObject.clickSearchButton();
driver.close();
	}

}
