package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20_Google_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			WebElement txtBox_search = driver.findElement(By.id("APjFqb"));
			txtBox_search.sendKeys("Bangalore");
			Thread.sleep(1000);
			WebElement optn_6 = driver.findElement(By.xpath("(//div[@class='OBMEnb']/ul/li)[5]"));
			optn_6.click();
			
			
			

		
	}

}
