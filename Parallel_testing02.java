package testNG_Programs01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Parallel_testing02 {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	
	public void login(String browsername) {
		
		
		if(browsername.equals("Chrome")) {
			Reporter.log("Launching Chrome");
			driver = new ChromeDriver();
			
		}
		if(browsername.equals("Edge")) {
			Reporter.log("Launching Edge");
			driver = new EdgeDriver();
	}
		if(browsername.equals("Firefox")) {
			Reporter.log("Launching Firefox");
			driver = new FirefoxDriver();
	}
		
		Reporter.log("Google search");
		driver.get("https://Google.com");
		WebElement se = driver.findElement(By.name("q"));
		se.sendKeys("mac m4 at best price");
		
		}
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		Reporter.log("Quiting Browser");
		driver.quit();
	}
	}
  
