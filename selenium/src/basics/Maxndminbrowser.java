package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maxndminbrowser {

	public static void main(String[] args) {
		/*Launch the empty browser*/
		WebDriver driver=new FirefoxDriver();
		/*Navigate to Gmail application*/
		driver.get("https://gmail.com");
		/*Maximize the browser*/
		driver.manage().window().maximize();
		/*Change the dimensions of the browser window to minimize browser*/
		Dimension dem=new Dimension(100,300);
		/*Minimize the Browser window*/
		driver.manage().window().setSize(dem);
		/*Close the browser */
		driver.close();
		
		

	}

}
