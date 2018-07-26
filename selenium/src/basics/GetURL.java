package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetURL {
	public static void main(String[] args)
	{
		/*Launch the empty browser*/
		WebDriver driver=new FirefoxDriver();
		/*Navigate to SCCD tool */
		driver.get("https://esls2.int.eu.smi.ibm.com");
		/*Navigate to Slack */
		//driver.get("https://gts-ibm.slack.com");
		/*Capture the Title of the page*/
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		/*Capture the URL of the current page*/
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		/*Capture the html code of the current page*/
		String htmlcode=driver.getPageSource();
		System.out.println(htmlcode);
		//driver.close();
		
	}

}
