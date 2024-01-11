package Week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class LearnAlert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alt  = driver.switchTo().alert();
		String msg = alt.getText();
		System.out.println(msg);
		alt.accept();	
		
	}

}
