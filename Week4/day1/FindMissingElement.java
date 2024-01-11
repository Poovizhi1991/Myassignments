package Week4.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {		
		// Find missing numbers from the array using List
		int[] numArray = {1,2,3,4,10,6,8};
		Arrays.sort(numArray);		
		int currentNum=0;
		int nextNum=0;
		for(int i=0; i<numArray.length-1; i++)
		{
			currentNum=numArray[i]+1;
			nextNum= numArray[i+1];			
			if(currentNum!=nextNum) 
			{ System.out.println("The next missing number is :"+currentNum);
			}								
		}			

	}
}


