package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlwithautomation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/PC/Documents/learningHTMLwithautomation.html");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(html/body/input)[1]"));
		e1.sendKeys("nikhath2286@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement e2=driver.findElement(By.xpath("(html/body/input)[2]"));
		e2.sendKeys("nlno");
		
        Thread.sleep(2000);
		
		WebElement e3=driver.findElement(By.xpath("(html/body/input)[3]"));
		e3.sendKeys("************");
		
	    Thread.sleep(2000);
		
		WebElement e4=driver.findElement(By.xpath("((html/body/form)[1]/input)[1]"));
		e4.sendKeys("Nikhath");
 		
        Thread.sleep(2000);
		
		WebElement e5=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e5.click();
        Thread.sleep(2000);
		
		WebElement e6=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		e6.click();
		
		 
		Thread.sleep(2000);
			
			WebElement e7=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
			e7.click();
		
			WebElement e8=driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));
			e8.click();
		
		
		
	}

}
