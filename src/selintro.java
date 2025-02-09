import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/praje/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");


//firefox launch--->WebDriver driver =  new FirefoxDriver(); 
//edge launch----> WebDriver driver =  new EdgeDriver(); 
	
WebDriver driver =  new ChromeDriver(); 
driver.get("https://www.w3schools.com/sql/");

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();


  

	}

}
