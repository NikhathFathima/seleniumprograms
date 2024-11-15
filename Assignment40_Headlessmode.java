package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment40_Headlessmode {

	public static void main(String[] args) {
		ChromeOptions c1=new ChromeOptions();
		c1.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(c1);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement icon_fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		icon_fashion.click();
	}

}
