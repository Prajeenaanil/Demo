import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


System.setProperty("webdriver.chrome.driver", "C:/Users/praje/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
WebDriver driver =  new FirefoxDriver();
String password = getpassword(driver);

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("rahul");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
driver.findElement(By.className("signInBtn")).click();
Thread.sleep(2000);
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
driver.close();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] Passwordarray = passwordtext.split("'");
		String Password = Passwordarray[1].split("'")[0];
		return Password;
		
	}

}
