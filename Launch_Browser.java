package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/chrome/");
		//EdgeDriver driver1=new EdgeDriver();
		//OperaDriver op=new OperaDriver();
		//SafariDriver s1=new SafariDriver();
		driver.manage().window().maximize();
	List<WebElement> li=driver.findElements(By.tagName("a"));
	
	int count=li.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement e1=li.get(i);
		    String s1=           e1.getAttribute("href");
		    System.out.println(s1);
	}

	}

}
