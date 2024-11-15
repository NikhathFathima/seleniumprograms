package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchfacebookwithidlocator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("nikhath2286@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikhath@2286");
		driver.findElement(By.name("login")).click();
	}

}
