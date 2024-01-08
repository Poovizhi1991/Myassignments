package Week3.day2;

public class WebElement {
	public void click()
	{
	System.out.println("If you have an account click ");
	}
	public void setText(String text)
	{
		System.out.println(text);
	}
	public static void main(String[] args) {
		
		WebElement element = new WebElement();
		element.click();
		element.setText("Sign In");
	}

}
