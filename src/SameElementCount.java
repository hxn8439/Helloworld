
public class SameElementCount{
	
	//Problem2:

	//Given 3 arrays as below,

	//String[] input1 = ["red", "blue", "green", "black", "yellow"];

	//String[] input2 = ["red", "green", "green", "black", "yellow"];

	//String[] input3 = ["red", "blue", "green", "blue", "yellow"];

	//Write a function sameElementsCount which takes the above 3 parameters, and check if there are same elements at an index and print the count.
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String[] input1 = {"red", "blue", "green", "black", "yellow"};
		String[] input2 = {"red", "green", "green", "black", "yellow"};
		String[] input3 = {"red", "blue", "green", "blue", "yellow"};
		
		SameElementCount(input1, input2, input3);

	}
	
	private static void SameElementCount(String[] input1, String[] input2, String[] input3)
	{
		int calc =0; 
		for(int i=0; i <input1.length; i++)
		{
			if(input1[i].equals(input2[i]) && input1[i].equals(input3[i]) )
			{
				calc++;
			}	
		}
		
		System.out.println(calc);
	}

}
