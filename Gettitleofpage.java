package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitleofpage {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
String title=driver.getTitle();
System.out.println(title);
driver.manage().window().maximize();
	}

}
