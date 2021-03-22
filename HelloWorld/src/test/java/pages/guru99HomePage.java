package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class guru99HomePage {
WebDriver driver;
By homePageUserName=By.xpath("//table//tr[@class='heading3']");

public guru99HomePage(WebDriver driver){

    this.driver = driver;

}
public String getHomePageDashboardUserName(){
	return driver.findElement(homePageUserName).getText();
}
}
