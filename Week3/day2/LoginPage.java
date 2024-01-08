package Week3.day2;

public class LoginPage extends BasePage {
	// Polymorphism - Method overriding
	public void performCommonTasks()
	{
		System.out.println("Task has been performed succesfully");
	}

	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();		
		login.findElement();
		login.enterText();
		login.clickElement();
		login.performCommonTasks();
		System.out.println("-----------");
		login.sendRequest("https://www.testleaf.com/");
		
		
		
		
	}
}
