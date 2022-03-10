import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class problem1{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Problem1:
		//Int[] input = {1,6,2,4,8,7};
		//Int total = 8;
		//Output = {1,2};
		//Write a function that take 2 of the above inputs and return the index of first 2 numbers that equals the total.
		
		int[] input = {1,6,2,4,8,7};
		int total = 8;
		SumOfTwo(input, total);
	}

	private static void SumOfTwo(int[] array, int number) 
	{
		
		//using map as per request from kp. 3-1-2022
		
		Map<Integer, Integer> map = new HashMap<>();
		
		IntStream.range(0, array.length).forEach(i -> map.put(i, array[i]));
		
		int counter = 0;
		
		for(int i=0; i<array.length; i++)
		{	
			if(map.get(i)+map.get(i+1)==number)
			{
				System.out.printf("{%d,%d}", i, i+1);
				break;
			}	
		}
			
		/*
		int sum = 0;
		int head = 0;
		int tail = 0;
		
		for(int i=0; i < (array.length-1); i++)
		{
		
			for(int j=0; j <(array.length-1); j++)
			{
				sum = array[i]+ array[j];
				//System.out.println(sum);
				
				if(sum == number && i != j && i < j)
				{
					head = i;
					tail = j;
					break;
				}	
				
				else
				{
					continue;
				}	
			}	
			
		}
			
		System.out.println("{"+ head +","+tail+"}"); */
	}
}
