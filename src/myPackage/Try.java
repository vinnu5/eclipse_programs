package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
	public static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//godvi//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		//String beforelogin=driver.getTitle();
		//System.out.println(beforelogin);
		driver.manage().window().maximize();// for maximizing the webpage
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Vacancies")).click();
		driver.findElement(By.xpath("(//i[contains(@class,'oxd-icon bi-caret-down-fill')])[2]")).click();
		driver.findElement(By.className("oxd-table-filter")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}