package seleniumWithHtmlUnitDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class OpenGoogleWithHTMLUnitDriver {

	@Test
	public void openGoogle(){
		long startTime=System.currentTimeMillis();
		WebDriver driver= new HtmlUnitDriver();
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Smile please");
		searchbox.submit();
		System.out.println("Title of the page: "+driver.getTitle());
		driver.quit();
		
		if(driver.getTitle().contains("Google"))
		{
			System.out.println("Test case executed successfully");
		}
		
		long endTime=System.currentTimeMillis();
		long totalTime=(endTime-startTime)/1000;
		System.out.println("Time taken: "+totalTime);
	}


}
