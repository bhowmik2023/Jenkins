package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLoginPractice {
	
	public void getLogin() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://automationexercise.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='fa fa-lock']"));
		
		
		
	}
public static void main(String[] args) throws InterruptedException {
	AutomationLoginPractice obj =new AutomationLoginPractice();
	obj.getLogin();
}
}
