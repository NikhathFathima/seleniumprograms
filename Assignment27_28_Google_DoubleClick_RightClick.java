package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment27_28_Google_DoubleClick_RightClick {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail_Link = driver.findElement(By.linkText("Gmail"));
		Thread.sleep(500);
		Actions click = new Actions(driver);
        click.doubleClick(gmail_Link).perform();
	//	click.contextClick(gmail_Link).perform();
		
}
}
