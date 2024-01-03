package Week2.day1;

public class IsPrimeNumber {
	// Check the given number is a prime or not
	public static void main(String[] args) {
		
		int num=17;
		boolean isPrime = false;
		for(int i=2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=true;
				break;
			}			
			
		}
		if(isPrime==true)
		{
			System.out.println("The number "+num+" is not a prime number");
		}
		else
		{
			System.out.println("The number "+num+" is a prime number");

		}

		
	}
	
	}
