package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment26_SBI_Login_without_rightClick {
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement ctn_Login_btn = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		ctn_Login_btn.click();
		
		WebElement txtBox_UserName = driver.findElement(By.name("userName"));
		txtBox_UserName.sendKeys("Nikhath@1234");
		WebElement txtBox_Password = driver.findElement(By.name("password"));
		txtBox_Password.sendKeys("abcd@1234");
		WebElement txtBox_Captcha = driver.findElement(By.id("loginCaptchaValue"));
		txtBox_Captcha.sendKeys("12345");
		
		WebElement btn_Login = driver.findElement(By.id("Button2"));
		btn_Login.click();
}
}