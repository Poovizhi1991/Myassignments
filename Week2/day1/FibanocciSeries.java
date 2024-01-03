
package Week2.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
		// Print Fibonacci Series of given number

		FibanocciSeries fNumbers = new FibanocciSeries();
		fNumbers.getRangeOfNumber(-0,8);

	}

	public void getRangeOfNumber(int fRange, int tRange)
	{

		int a = 0, b = 1;

		System.out.println("The Fibonacci Series of given range of numbers");
		System.out.println("--------------------------------------");

		for (int i = fRange; i < tRange; i++) {
		    System.out.println(a+"");			
			int nextTerm = a + b;
			a = b;
			b = nextTerm;     	


		}

	}

}
