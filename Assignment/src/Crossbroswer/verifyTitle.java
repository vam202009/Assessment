package Crossbroswer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class verifyTitle {
WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName){
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
			else if(browserName.equalsIgnoreCase("chrome"))
				
			{
			    driver=new ChromeDriver();
			}
			
		driver.get("https://www.topdanmark.dk");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
