package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11_AmezonSerach_relXpath {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement txtBox_search = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtBox_search.sendKeys("shoe");
		WebElement btn_Search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btn_Search.click();
		
		driver.quit();

	}
}
