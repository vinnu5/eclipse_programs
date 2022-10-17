package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class utube {
	public static String url ="https://www.youtube.com/";
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//godvi//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Chiranjeevi full josh songs");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon")). click();
        Thread.sleep(2000);
      
        driver.findElement(By.xpath("(//div[@id='channel-info'])[2]")). click();
      
}
	
}