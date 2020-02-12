package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Common_Base {
	static WebDriver driver;
	static PageObjects p; 
	
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		p = new PageObjects(driver);
	}
	
	public static void login() {
		p.signin.click();
		p.username.sendKeys("Lalitha");
		p.password.sendKeys("password123");
		p.login.click();
	}
	public static void loginVariables(String username ,String password) {
		p.signin.click();
		p.username.sendKeys(username);
		p.password.sendKeys(password);
		p.login.click();
	}
	
	
	public static void productselect() {
		Actions action = new Actions(driver);
		action.moveToElement(p.allcategory).click().build().perform();
		action.moveToElement(p.Electronics).click().build().perform();
		action.moveToElement(p.Headphones).click().build().perform();
		p.addtocart.click();
		p.Cart.click();
		
	}
	public static void paymentOptions() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@465");
		driver.findElement(By.xpath("//div[3]//input[1]")).click();
		driver.findElement(By.xpath("//input[@name='transpwd']")).click();
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		driver.findElement(By.xpath("//table [@name='address']")).click();
		
		
	}
}
