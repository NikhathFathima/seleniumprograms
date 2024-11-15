package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6_LinkText_Amezon_CLick_Mobiles {
	/*
	 * Assignment6 - 
			WAP launch Amazon.in try to click mobile with help of Linktest Locator 
	 */
		public static void main(String[] args)
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in");
			WebElement linkText_Mobiles = driver.findElement(By.linkText("Mobiles"));
			linkText_Mobiles.click();
			driver.quit();

		}
}
