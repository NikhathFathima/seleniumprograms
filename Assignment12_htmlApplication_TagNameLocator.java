package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12_htmlApplication_TagNameLocator {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/GrowtechMind/learningHTML1.html");
		WebElement url_Click = driver.findElement(By.tagName("a"));
		url_Click.click();
		driver.close();

	}

}
