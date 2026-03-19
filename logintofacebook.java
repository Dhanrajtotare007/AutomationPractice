package MavenPackage01.MavenProject01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintofacebook {

	@Test
	
	public void loginpage() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		fbloginpage fb = new fbloginpage(driver);
		fb.UN();
		fb.Psw();
		
		driver.quit();
		
		
	}

}
