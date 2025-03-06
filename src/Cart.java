import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/praje/Chromedriver new/chromedriver-win64/chromedriver.exe");

		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		int j=0;		
List<WebElement> veggies =	driver.findElements(By.xpath("//h4[@class='product-name']"));

for(int i=0;i<veggies.size();i++)
{
	String[]  name= veggies.get(i).getText().split("-");
	
    String nospacename= name[0].trim();
    
    List<String> myList = new ArrayList<>(Arrays.asList("Cucumber","Brocolli","Beetroot"));
    
    if(myList.contains(nospacename))
   
    	
    		{
    	j++;
    	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
    	
    	if(j==myList.size())

		{

		break;

		}
    		}
    
    
}
		
		
		
	}

}
