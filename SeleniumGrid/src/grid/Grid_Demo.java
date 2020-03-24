package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class Grid_Demo
{
	WebDriver[] driver=new WebDriver[2];
	String[] nodeurl=new String[2];
	String baseurl="http://demowebshop.tricentis.com/login";
	
	@Test
	public void sart() throws MalformedURLException
	{
		
		nodeurl[0]="http://172.24.72.57:4455/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
		 driver[0] =new RemoteWebDriver(new URL(nodeurl[0]),capabilities);
		 driver[0].get(baseurl);
	}

}
