package Week1.day2;

public class ConvertPostiveNumber {
public static void main(String[] args) {
	// Convert the given number from Negative to Positive using If control statement
	int number = -40;
	String printnumber = "The number "+number+" is a Negative number.";
	
 if(number>0)
 {
	 printnumber="The number "+number+" is a Positive number.";
	 System.out.println(printnumber);
 }	

 else
 {
	 number=40;
	 printnumber="The number -40 is converted into 40.";
	 System.out.println(printnumber);
 }
}

}
