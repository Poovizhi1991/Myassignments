package Week2.day1;

public class FindIntersection {
	public static void main(String[] args) {
		// Find the identical numbers from two sets of arrays
		
		int[] numSet1= {3,2,11,4,6,7};
		int[] numSet2= {1,2,8,4,9,7};
		System.out.println("The Identical numbers are----");
		for(int i=0; i< numSet1.length;i++)
		{
			for(int j=0;j<numSet2.length;j++)
			{
				if(numSet1[i]==numSet2[j])
				{					
					System.out.println(numSet1[i]);
				}
							
			}
		}
	
		
		
		
	}

}
