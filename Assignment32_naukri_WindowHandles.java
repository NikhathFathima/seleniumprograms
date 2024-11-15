package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment32_naukri_WindowHandles {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQjw05i4BhDiARIsAB_2wfB_iBpyW0N05KOLG3MtFuwEoTBizQ1vGqaMgdWznQ_uQ0vocYroqC4aAv9REALw_wcB&gclsrc=aw.ds");
		WebElement btn_google = driver.findElement(By.xpath("//span[.='Google']"));
		btn_google.click();
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> s1i = s1.iterator();
		String parent_id = s1i.next();
		String child_id = s1i.next();
		
		driver.switchTo().window(child_id);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("abcd@xyz.com");
		
		
		
	}
}
