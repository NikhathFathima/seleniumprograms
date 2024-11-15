package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment17_GrotechMinds_DragDrop {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e2_json = driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement e1_targetBox = driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions json_DragDrop = new Actions(driver);
		json_DragDrop.dragAndDrop(e2_json, e1_targetBox).perform();
		
//		driver.quit();
		
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://grotechminds.com/drag-and-drop/");
//		
//		WebElement e1=driver.findElement(By.xpath("//div[@id='container-10']"));
//		WebElement e2=driver.findElement(By.xpath("//div[@id='div2']"));
//		
//		Actions a1=new Actions (driver);
//		a1.dragAndDrop(e1, e2).perform();

	}
}
