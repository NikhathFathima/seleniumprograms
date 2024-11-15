package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_PartialLinkText_Amezon_CustServices {
	/*
	 * Assignment7 - 
		WAP launch Amazon.in and click on Customer service with help of  PartialLinkText locator
	 */

	public static void main(String[] args)
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement partial_linkText_Services = driver.findElement(By.partialLinkText("Service"));
		partial_linkText_Services.click();
		driver.quit();

	}
}
