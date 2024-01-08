package Week3.day2;

public class Elements extends Button {
	
public static void main(String[] args) {
	
	Elements formDetails =  new Elements();
	CheckBoxButton clickCheck = new CheckBoxButton();
	RadioButton clickRadio = new RadioButton();
	TextField enterText = new TextField();
	
	enterText.click();
	enterText.setText("Sign In");
	clickCheck.clickCheckButton();
	clickRadio.selectRadioButton(true);	
	formDetails.submit();
}

}
