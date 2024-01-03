package Week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafAppsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Locate the username field
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		//Locate the password field
		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");
		WebElement loginBtn = driver.findElement( By.className("decorativeSubmit"));
		loginBtn.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//Click on the Lead menu
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the create lead sub menu
		driver.findElement(By.linkText("Create Lead")).click();

	}

}
