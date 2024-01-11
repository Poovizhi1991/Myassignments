package Week4.day1;
import java.util.Arrays;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		// Find the second largest number from the given array

		int[] num = {3,2,11,4,6,7};
		Arrays.sort(num);

		if (num.length >= 2) {

			int secondLargeNum = num[num.length - 2];
			System.out.println("The 2nd largest number from the given array is: " + secondLargeNum);
		} 	


	}

}
