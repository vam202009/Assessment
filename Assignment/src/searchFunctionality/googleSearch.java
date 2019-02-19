package searchFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    WebElement searchField = driver.findElement(By.name("q"));
	    searchField.sendKeys("Topdanmark");
	    //WebElement searchButton = driver.findElement(By.name("btnK"));
	    //searchButton.click();
	    
	   List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1 sbl1p']"));
	   
	   for (int j = 0; j < 1; j++) {
	  String result = list.get(j).getText();
	  System.out.println(result);
	  if (result.equals("Topdanmark"))
		  System.out.println("Pass");
		  else{
			  System.out.println("Fail");
		  }
		  }
	}

}
