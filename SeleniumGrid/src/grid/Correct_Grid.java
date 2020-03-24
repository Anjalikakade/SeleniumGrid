

package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Correct_Grid 
{
	WebDriver driver;
	
	@Test
	public void verifylogin() throws MalformedURLException
	{
	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	 capabilities.setBrowserName("chrome");
	 capabilities.setPlatform(Platform.WINDOWS);
	 
	 driver =new RemoteWebDriver(new URL("http://172.24.72.57:4455/wd/hub"),capabilities);
	 
	 driver.get("http://demowebshop.tricentis.com/login");
		
		
		
		String title=driver.getTitle();
		System.out.println("Title is:"+title);

		driver.manage().window().maximize();//to maximize the window
		driver.findElement(By.id("Email")).sendKeys("anjalik2997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Anjali");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//WebElement ele;
		
	
	 
	}
	
	

}
