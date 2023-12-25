package Week1.day2;

public class CheckPositiveNumber {
	public static void main(String[] args) {
		
		// Check the given number is Positive or Negative using If else control statement
		
		CheckPositiveNumber checkInt = new CheckPositiveNumber();
		checkInt.checkInteger(35);
		
	}
	public String checkInteger(int checkInt)
	{
		String printResult = "The number is neither Positive nor Negative";
		if (checkInt > 0)
		{
			printResult="The number is Positive.";
			System.out.println(printResult);
		}
		else if(checkInt <0)
		{
			printResult="The number is Negative.";
			System.out.println(printResult);
		}
		else
		{
			System.out.println(printResult);
		}
		return printResult ;
	}

}
