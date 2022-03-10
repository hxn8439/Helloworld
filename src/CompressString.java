
public class CompressString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Example 1
		String input1 = "aaaabbccccc";
		
		//Example 2 
		String input2 = "abbccccccaa";
		
		stringCount(input1);
	}
	
	private static void stringCount(String input)
	{
		char curr = 0;
		int charNum = 1;
		String result = " ";
		
		//implementation 1 
		
		for(int i =0; i < input.length()-1; i++)
		{
			curr = input.charAt(i);
			if(curr == input.charAt(i+1))
			{
				charNum++;
			}
			
			else
			{
				result = result + curr + charNum;
				charNum = 1;
			}	
		}
		
		if(charNum > 0)
		{
			result = result + curr + charNum;
		}
		
		System.out.println(result);
	}

}
