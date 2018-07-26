package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IdentifyVerse_new {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://w3.ibm.com");
		String x="//button[@class='btn-control js-sigin-popup-dismiss awf-card__titlebar__cta__close -awf-focus -awf-link-inverted']";
		driver.findElement(By.xpath(x)).click();
		driver.findElement(By.xpath("//a[text()='Mail: Verse']")).click();
		String x1="//*[@id='username' and  @class='textField' and @type='text' and @name='username' ]";
		driver.findElement(By.xpath(x1));
		/*.sendKeys("bsashire@in.ibm.com").
		
		sendKeys(Keys.ENTER).perform();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();*/

	}

}
