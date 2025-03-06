import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/praje/Chromedriver/chromedriver-win64/chromedriver.exe");

		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Prajeena");
		driver.findElement(By.name("email")).sendKeys("Prajeena@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
	  WebElement staticdropdown =  driver.findElement(By.id("exampleFormControlSelect1"));
		
	    Select dropdown = new Select(staticdropdown);
	    dropdown.selectByContainsVisibleText("Female");
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("22-01-1990");
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
