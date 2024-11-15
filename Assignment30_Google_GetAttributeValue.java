package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment30_Google_GetAttributeValue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		for(int i=0; i<li.size(); i++)
		{
			WebElement list_li =	li.get(i);
			String className = list_li.getAttribute("class");
			System.out.println(className);
		}
		
	}

}
