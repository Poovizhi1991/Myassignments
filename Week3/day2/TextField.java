package Week3.day2;

public class TextField extends WebElement {
	
	public void getText()
	{
		System.out.println("First Name: Poovizhi");
		System.out.println("Last Name: Prabhaharan");		
	}
	
	public static void main(String[] args) {
		TextField enterText = new TextField();
		enterText.click();
		enterText.setText("Sign In");
		enterText.getText();
	}
}
