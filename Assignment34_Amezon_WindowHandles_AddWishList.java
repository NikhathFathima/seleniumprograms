package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment34_Amezon_WindowHandles_AddWishList {
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
		String parentID = is1.next();
		String childID = is1.next();
		
		driver.switchTo().window(childID);
		
		WebElement btn_wishList = driver.findElement(By.id("wishListMainButton"));
		btn_wishList.click();

	}
}
