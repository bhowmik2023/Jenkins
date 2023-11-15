package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PracticeAlart {
	
	
public void getAlert() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath(";//*[@class='btn btn-primary")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
	}
public static void main(String[] args) throws InterruptedException {
	PracticeAlart obj = new PracticeAlart();
	obj.getAlert();
}
}


