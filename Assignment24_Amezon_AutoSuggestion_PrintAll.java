package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment24_Amezon_AutoSuggestion_PrintAll {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txtBox_Search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_Search.sendKeys("Shoes");
		Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		System.out.println(li.size());
		for(int i=0; i<li.size();i++)
		{
			WebElement auto1 = li.get(i);
			System.out.println(auto1.getText());
		}
}
}
