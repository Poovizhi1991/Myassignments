package Week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCountOfRowsAndColumns {
	public static void main(String[] args) {
		// Find the rows and columns count of a table
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> rowCount = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		List<WebElement> columnCount = driver.findElements(By.xpath("//div[@class='render']/table/thead/tr/th"));
		
		System.out.println("The number rows = "+rowCount.size());
		System.out.println("The number columns= "+columnCount.size());
	
		
		
		
	}

}
