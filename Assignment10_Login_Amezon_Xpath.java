package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10_Login_Amezon_Xpath {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		/*WebElement txt_Mobile= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		txt_Mobile.sendKeys("8050789706");
		WebElement btn_cntinue= driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		btn_cntinue.click();
		WebElement txt_Pwd= driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		txt_Pwd.sendKeys("niks*999");
		WebElement btn_SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		btn_SignIn.click();*/
		
		WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("shoe" + Keys.ENTER);
		
	}
}
