package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_SearchGTM_YouTube_IDLocator {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement txtBoxSearch = driver.findElement(By.name("search_query")); 
		// Que - not able to send text using id locator
//		WebElement txtBoxSearch = driver.findElement(By.id("search")); 
		txtBoxSearch.sendKeys("Growtech Minds");
		txtBoxSearch.sendKeys(Keys.ENTER);

	}

}
