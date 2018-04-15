package seleniumWithPhantomJS;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class OpenGoogleWithDesiredCapabilities {

	private static PhantomJSDriver driver;
	
	@Test
	public void openGoogle() {
		// TODO Auto-generated method stub

		Capabilities capabilities = new DesiredCapabilities();
		((DesiredCapabilities) capabilities).setJavascriptEnabled(true);
		((DesiredCapabilities) capabilities).setCapability("takesScreenshot", true);
		((DesiredCapabilities) capabilities).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Users\\Elcot\\Downloads\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver = new PhantomJSDriver(capabilities);
		driver.get("http://www.google.co.in");
		if(driver.getTitle().equalsIgnoreCase("google")){
			System.out.println("Google opened");
		}
	}	

}
