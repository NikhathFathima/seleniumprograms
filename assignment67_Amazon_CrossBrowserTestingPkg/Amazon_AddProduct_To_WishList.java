package assignment67_Amazon_CrossBrowserTestingPkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon_AddProduct_To_WishList extends Browser_Launch_Quit
{

	@Test
	
	public void AddToWishList()
	{
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
		WebElement shoe1st = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		shoe1st.click();
		// add to wishlist
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> is1 = s1.iterator();
		String parentID = is1.next();
		String childID = is1.next();
		driver.switchTo().window(childID);
		WebElement btn_wishList = driver.findElement(By.id("wishListMainButton"));
		btn_wishList.click();
	}
}
