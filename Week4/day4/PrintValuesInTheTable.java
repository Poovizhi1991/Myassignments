package Week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesInTheTable {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> tableData = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		System.out.println("Library Values");
		System.out.println("--------------");
		for(int i=1;i<=tableData.size();i++)
		{
			String library = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(library);
		}
		
	
		
	}

}
