package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment41_Amezon_ScrollUp_Down {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		WebElement abtAmzn = driver.findElement(By.xpath("//a[.='About Amazon']"));
		
		Point v1 = abtAmzn.getLocation();
		int x = v1.getX();
		int y = v1.getY();
		System.out.println("X cordinate = "+x);
		System.out.println("Y cordinate = "+y);
		
		Thread.sleep(1000);
		JavascriptExecutor var1 = driver;
		var1.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(1000);
		var1.executeScript("window.scrollBy(0,-"+y+")");
		
	}
}
