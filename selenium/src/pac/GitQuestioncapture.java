package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitQuestioncapture {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.interviewquestionspdfs.com/tag/git-interview-questions-tutorialspoint/");
        String question=driver.findElement(By.xpath("//a[text()='What is GIT?']")).getText();
        System.out.println(question);
        driver.findElement(By.xpath("//a[text()='What is GIT?']")).click();
        String answer=driver.findElement(By.xpath("//p[contains(text(),'GIT is a')]")).getText();
        System.out.println(answer);
	}

}
