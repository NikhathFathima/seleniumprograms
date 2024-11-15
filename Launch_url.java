package seleniumbasics;


import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_url {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		driver.manage().window().minimize();
		//Thread.sleep(2000);
		//driver.close();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		}

}
