package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	WebDriver driver;
By userIdTextbox= By.name("uid");
By passwordTextBox=By.name("password");
By loginButton=By.name("btnLink");
By TitleText=By.className("barone");

public Guru99Login(WebDriver driver) {
	this.driver=driver;
	}
//set the name in text box
public void setUserName(String strUserName) {
	driver.findElement(userIdTextbox).sendKeys(strUserName);
}
public void setPassword(String passwordText)
{
	driver.findElement(passwordTextBox).sendKeys(passwordText);
}
public void clickLogin(){
	driver.findElement(loginButton).click();
}
public String getLoginTitle() {
	return driver.findElement(TitleText).getText();
	
}
}
