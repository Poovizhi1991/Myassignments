package Week3.day2;

public class BasePage {
	// Polymorphism - Method overloading
	public void sendRequest(String endPoint)
	{
		System.out.println("Endpoint: "+endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody,boolean requestStatus)
	{
		System.out.println("Endpoint: "+endPoint);
		System.out.println("Request Data to be send: "+requestBody);
		System.out.println("Request status: "+requestStatus);
	}
	
	public void findElement()
	{
		System.out.println("Find the element.");
	}
	public void  clickElement()
	{
		System.out.println("Click the element.");
	}
	public void enterText()
	{
		System.out.println("Enter the text.");
	}
	public void performCommonTasks()
	{
		System.out.println("Task has been performed");
	}
	public static void main(String[] args) {
		
		BasePage apiRequest = new BasePage();
		apiRequest.sendRequest("https://www.testleaf.com/");
		System.out.println("----------------------------------");
		apiRequest.sendRequest("https://platform.testleaf.com/#/","{\"username\", \"email\", \"password\"}",true);
		
	}

}
