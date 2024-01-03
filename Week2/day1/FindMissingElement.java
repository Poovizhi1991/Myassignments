package Week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Find a missing element of an array
		
		int[] numbers= {1,4,3,2,8,6,7};
	    Arrays.sort(numbers);
	    for(int i = numbers[0]; i < numbers.length; i++)
	    {
	    	
	    	if(i!=numbers[i-1])
	    	{
	    		System.out.println("The missing number is : "+i);
	    		break;
	    	}
	    
	    	
	    }

	}

}
