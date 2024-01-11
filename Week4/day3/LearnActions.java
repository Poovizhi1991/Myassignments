package Week4.day3;

//import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.aventstack.extentreports.utils.FileUtil;

public class LearnActions {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://www.myntra.com/");
		
		Actions perfromAction = new Actions(driver);
		WebElement scrollDwn = driver.findElement(By.xpath("//strong[text()='SHOP ONLINE AT MYNTRA WITH COMPLETE CONVENIENCE']"));
		perfromAction.scrollToElement(scrollDwn).perform();
		System.out.println(scrollDwn.getText());
		File src = driver.getScreenshotAs(OutputType.FILE);
		File getSrc = new File("./snaps/LeafgroundDrag.png");
		FileUtils.copyFile(src, getSrc);
		
		
		
	}

}
