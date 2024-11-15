package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment33_Amezon_WindowHandles_AddCart {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
		WebElement shoe1st = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		shoe1st.click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> is1 = s1.iterator();
		String parentWndoID = is1.next();
		String childWndoID = is1.next();
		
		driver.switchTo().window(childWndoID);
		
		WebElement btn_AddToCart = driver.findElement(By.id("add-to-cart-button"));
		btn_AddToCart.click();
		
	    driver.close();
	    
	    
		
		
		

	}

}
