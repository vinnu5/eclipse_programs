package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gurudemo {
	public static String url ="https://demo.guru99.com/test/newtours/";
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//godvi//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("zee");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("984868092");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("gurusuru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deva");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("deva");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		
		
		
		
}
}