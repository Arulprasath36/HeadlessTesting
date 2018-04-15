package seleniumWithPhantomJS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SearchGoogleWithDesiredCapabilties {
	public WebDriver driver;
	  public String baseUrl;
	  public StringBuffer verificationErrors = new StringBuffer();
	  protected static DesiredCapabilities dCaps;
	 
	  @BeforeSuite
	  public void setUp() throws Exception {
		  
		  dCaps = new DesiredCapabilities();
		  dCaps.setJavascriptEnabled(true);
		  dCaps.setCapability("takesScreenshot", false);
		  dCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Users\\Elcot\\Downloads\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		  driver = new PhantomJSDriver(dCaps);
		  baseUrl = "https://google.com/";
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 
	  @Test
	  public void searchGoogle() throws Exception {
	    driver.get(baseUrl);
	   WebElement searchBox=driver.findElement(By.name("q"));
	   searchBox.sendKeys("Say cheese");
	   searchBox.submit();
	   if(driver.getTitle().contains("Google")){
		   System.out.println("google opened");
	   }
	  }
	 
	  @AfterSuite
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	    }
	  }

