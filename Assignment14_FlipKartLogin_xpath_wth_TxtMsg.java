package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14_FlipKartLogin_xpath_wth_TxtMsg {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement icon_fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		icon_fashion.click();
		
		

	}
}
