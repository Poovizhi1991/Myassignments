package Week3.day2;

public class RadioButton extends Button{
	public void selectRadioButton(boolean setradio)
	{
		
		System.out.println("Married: True");
		if(setradio==true)
		{
			System.out.println("Are you sure you want to submit? : Yes");
		}
		else
		{
			System.out.println("Are you sure you want to submit? : NO");
		}
		
		
		
	}
	public static void main(String[] args) {
		
		RadioButton selectRadio = new RadioButton();
		selectRadio.selectRadioButton(true);
		
		
	}

}
