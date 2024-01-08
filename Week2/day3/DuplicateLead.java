package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		//Check the duplicate lead
		// Open the URL
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement( By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CRUZZE");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poovizhi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhaharan"); 
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kanmani");
		driver.findElement(By.name("departmentName")).sendKeys("Sales");
		driver.findElement(By.name("description")).sendKeys("For training.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("poovi@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Itech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Poovi");
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		String title1= driver.getTitle();
		System.out.println(title1);
		
		
		
		
		
		
		
	}

}
