package Week2.day1;

public class CheckPalindrome {
	public static void main(String[] args) {
		// Check the input is palindrome or not
		
		CheckPalindrome checkPalin=new CheckPalindrome();
		checkPalin.isPalindrome(5335);
	}
	
	public void isPalindrome(int num)
	{
		int input=num;
		int output=0;
		 while (num > 0) {
	            int reverse = num % 10;
	            output = output * 10 + reverse;
	            num =num/10;
	        }
		 if(input==output)
		 {
			System.out.println("Given input "+input+" is a Palindrome"); 
		 }
		 else
		 {
			 System.out.println("Given input "+input+" is not a Palindrome");
		 }
		 
	}

}
