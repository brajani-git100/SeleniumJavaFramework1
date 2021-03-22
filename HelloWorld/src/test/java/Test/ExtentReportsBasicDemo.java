package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	private static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		 // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test1 = extent.createTest("Google Test", "T validate google search test functionality");
	       
	        
	        System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chrome\\chromedriver.exe");
	    	 driver=new ChromeDriver();
	    	 test1.log(Status.INFO, "starting Test Case");
	    	 
	    	 
	    	 driver.get("https:google.com/");
	    	 test1.pass("navigated to google.com");
	    	 driver.findElement(By.name("q")).sendKeys("rajani thite");
	    	 test1.pass("keys entered in search text box");
	    	 driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	    	 test1.pass("Test keyboard enter key");
	    	 driver.close();
	    	 
	    	 
	    	 driver.quit();
	    	 test1.pass("closed the browser");
	    	 test1.info("Test Completed");
	    	// calling flush writes everything to the log file
	         extent.flush();
	}

}
