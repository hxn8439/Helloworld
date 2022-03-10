import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.IntStream;


public class problem2 {

	public static void main(String[] args) 
	{
		//String[] input = {“Samsung”, “Nokia”, “iPhone”, “Pixel”, “Nokia”,. “Samsung”};
		//Given above input, you should be able to return output:
		//Output = {“Samsung2”, “Nokia2”, “iPhone1”, “Pixel1”, “Nokia2”,. “Samsung2”}
		
		String[] input ={"Samsung", "Nokia", "iPhone", "Pixel", "Nokia", "Samsung"};
		RewriteStringArray(input);
	}
	
	private static void RewriteStringArray(String[] array)
	{
		//use map as per request from KP. 3-1-2022
		
				Map<Integer, String> map = new HashMap<>();	
				
				//alternative to for-loop. use for-each
				IntStream.range(0, array.length).forEach(i -> map.put(i, array[i]));
				int counter = 0;
				
				for(int i=0; i<array.length; i++)
				{	
					if( map.get(counter) == map.get(i) && counter!=i)
					{
						map.put(counter, map.get(counter)+"2");
						map.put(i, map.get(i)+"2");
						i = 0;
						counter++;
					}
					
					if(counter == array.length)
					{
						break;
					}
					
					if(i == array.length-1 && counter<(((array.length*3)/4)))
					{
						map.put(counter, map.get(counter)+"1");
						i = 0;
						counter++;
					}	
				}
				
				//Traversing Map
		        Set<Map.Entry<Integer, String>> setter = map.entrySet();//Converting to Set
		        Iterator<Entry<Integer, String>> iter = setter.iterator();
		        
		        while (iter.hasNext()) 
		        {
		            //Converting to Map.Entry to get key and value separately
		            Map.Entry<Integer, String> access =  iter.next();
		            System.out.println(access.getValue());
		        }
		
	
		/* Reviewed on 3-1-2022. Do not use nested for loops
		int counter = 0;
		
		for(int i =0; i<(array.length-1); i++)
		{
			for(int j =0; j<(array.length); j++)
			{
				//System.out.println( array[i]+" = "+array[j]);
				//System.out.println(i+" = "+j);
				
				if(array[i].equals(array[j]) && i != j && i < j)
				{
					counter=2;
					array[i]= array[i]+counter;
					array[j]= array[j]+counter;
					counter=0;
					break;
				}	
				
				else if((!(array[i].equals(array[j]))) && i != j && j == array.length-1 && !array[i].contains("2"))
				{
					counter=1;
					array[i]=array[i]+counter;
					counter=0;
					continue;
				}
			}
		}
		
		System.out.println(java.util.Arrays.toString(array));
		*/	
        
	}

}
