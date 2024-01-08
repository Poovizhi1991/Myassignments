package Week3.day2;

public class Button extends WebElement {
	public void submit()
	{
		System.out.println("Click here to submit your details");
		System.out.println("Submit");
	}

	public static void main(String[] args) { 
		Button clickButton = new Button();
		clickButton.click();
		clickButton.setText("Sign In"); 
		clickButton.submit(); 
	}


}
