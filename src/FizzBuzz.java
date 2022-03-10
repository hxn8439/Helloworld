
public class FizzBuzz {

	//Problem1: 
	//FizzBuzz:
	//Loops thru the value that is sent as a parameter.
	//And if the index is div 3, print Fizz, if the index is div 5 print Buzz, if it is Div by 3 and 5 print FizzBuzz.
	
	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		FizzBuzz(20);
	}
	
	private static void FizzBuzz(int n)
    {
		//TODO Auto-generated method stub.
		/*
			for(int i=0; i <n; i++) 
			{
				 implementation 1 
				 
				if(i%3==0 && i%5==0)
				{
					System.out.println("FizzBizz");
				}
				
				else if(i%3==0)
				{
					System.out.println("Fizz");
				}
				
				else if(i%5==0)
				{
					System.out.println("Buzz");
				}
				
				else
				{
					System.out.println(i);
				}	
			}
		*/
		
		//second implementation (optimized)
		for(int i=0; i <n; i++) 
		{
			String temp = " ";
			
			if(i % 3 == 0)
			{
				temp = "Fizz";
			}
			
			if(i % 5 == 0)
			{
				temp += "Buzz";
			}
			
			if(temp != " ")
			{
				System.out.println(temp);
			}
			
			else
			{
				System.out.println(i);
			}	
		}
	}

}
