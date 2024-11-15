package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment18_GrotechMinds_DragDrop_revert {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e2_json = driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement e1_targetBox = driver.findElement(By.id("div2"));
		
//		Thread.sleep(1000);
		Actions json_DragDrop = new Actions(driver);
		
		json_DragDrop.dragAndDrop(e2_json, e1_targetBox).perform();
		
		Thread.sleep(1000);
		//revert
		json_DragDrop.dragAndDrop(e1_targetBox, e2_json).perform();
//		driver.close();
	}

}
