import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javabasics {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/praje/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");

		WebDriver driver =  new ChromeDriver(); 	
		
 ArrayList<String>  a = new ArrayList<String>();
 a.add("string 1");
 a.add("string 2");
 a.add("string 3");
 a.add("string 4");
 a.add("string 5");
 a.add("string 6");
 a.add("string 7");
 a.add("string 8");
 System.out.println(a.get(1));
 
 a.contains("string 1");
 
 for( String val: a)
 {System.out.println(val);}
 
 
 String b = new String("Hello world");
 
 for (int i=b.length()-1;i>=0;i--) {
	 
	 System.out.println(b.charAt(i));
	 
	 
 }
}
}