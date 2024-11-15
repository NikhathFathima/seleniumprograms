package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment42_YouTube_ScrollDown_Infinite {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement txtBoxSearch = driver.findElement(By.name("search_query")); 

		txtBoxSearch.sendKeys("India");
		txtBoxSearch.sendKeys(Keys.ENTER);
		
		Point p1 =      txtBoxSearch.getLocation();  
        int x=    p1.getX();               
        int y =   p1.getY();              
      
        System.out.println(x);
        System.out.println(y);
		
		Thread.sleep(1000);
		
		/*int y = 1000;
		for(int i=0; i>=0; i++)
		{
			y+=1000;
			JavascriptExecutor v2 = driver;
			v2.executeScript("window.scrollBy(0,"+y+")");
			Thread.sleep(1000);
		}*/
		int i = 10;
		while(i>5)
		{
			JavascriptExecutor v2 = driver;
			v2.executeScript("window.scrollBy(0,"+y+")");
			Thread.sleep(1000);
		}

	}
}
