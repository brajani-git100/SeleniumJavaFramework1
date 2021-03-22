package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=;
By textBox_search= By.name("q");
By button_Search=By.name("btnk");
public GoogleSearchPageObjects(WebDriver driver) {
	this.driver=driver;
}

public void settestInSearchBox(String text) {
	driver.findElement(textBox_search).sendKeys(text);
	}

public void clickSearchButton() {
	driver.findElement(button_Search).sendKeys(Keys.RETURN);
}
}
