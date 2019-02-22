package searchFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext579458\\Assignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(300); 
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.contentEquals("Google")){
		System.out.println("Google has been opened successfully");
		}
		else{
		System.out.println("Google is not opened");
		}
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Topdanmark");
		Thread.sleep(300);
		System.out.println(driver.findElements(By.xpath("//ul[@class='erkvQe']//li")).size());
		if(driver.findElements(By.xpath("//ul[@class='erkvQe']//li")).size()>0){
		List<WebElement> SearchList = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println("Suggestion list value:" + SearchList.get(0).getText());
		if (SearchList.get(0).getText().equalsIgnoreCase("Topdanmark")){
		System.out.println("Content found exactly same");
		}else{
		System.out.println("Content found mismatching");
		}
		}
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		driver.quit();
	}

}
