package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment39_GrotechMinds_javascript_Popup1 {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/automate-me/");
		WebElement regPage = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__overlay'])[7]"));
		Actions hvr_RegPage = new Actions(driver);
		hvr_RegPage.moveToElement(regPage).perform();
		Thread.sleep(1000);
		WebElement btn_readMore = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer elementor-flip-box__back'])[4]/div/div/a"));
		btn_readMore.click();
		Thread.sleep(3000);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> s1i = s1.iterator();
		String parentID = s1i.next();
		String childID = s1i.next();
		
		
		driver.switchTo().window(childID);
		
		Thread.sleep(1000);
		
		WebElement btn_click = driver.findElement(By.xpath("//button[.='Click ']"));
		btn_click.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
	}

}
