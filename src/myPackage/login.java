package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Users//godvi//Downloads//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	String beforelogin=driver.getTitle();
	System.out.println(beforelogin);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(2000);
	String afterlogin=driver.getTitle();
	if(beforelogin.equals(afterlogin)) {
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		System.out.println("Title matches");
		
	}else {
		System.out.println("title mismatched");
	}
	driver.close();
}
}