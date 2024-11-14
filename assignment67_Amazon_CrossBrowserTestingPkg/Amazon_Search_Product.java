package assignment67_Amazon_CrossBrowserTestingPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon_Search_Product  extends Browser_Launch_Quit
{
	@Test
	public void SearchProduct()
	{
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);	
	}

}
