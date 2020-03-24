package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class GridDemo1 
{

	WebDriver driver;
	
	@Test
	public void checkport() throws MalformedURLException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://demowebshop.tricentis.com/login";
		String node="http://172.24.84.18:4444/wd/hub";
		 DesiredCapabilities cap = DesiredCapabilities.chrome();
		 driver = new RemoteWebDriver(new URL(node), cap);
		 
		 driver.navigate().to(url);
		 Thread.sleep(5000);
		// driver.quit();
	}
	
	

}
