package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21_Amezon_AutoSuggestion {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txtBox_Search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_Search.sendKeys("Shoes");
		Thread.sleep(1000);
		WebElement slct_2 = driver.findElement(By.xpath("(//div[@class='two-pane-results-container']/div/div)[2]"));
		slct_2.click();

	}

}
