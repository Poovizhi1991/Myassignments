package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframes {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click(); 
		
	}

}
