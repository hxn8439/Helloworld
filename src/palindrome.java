
public class palindrome{

	   public static void main(String[] args) 
	   {
           // TODO Auto-generated method stub
           String input = "racecar";
           System.out.println(checkPalindrome(input));
           
           //binary search example
           
           /*
            * cannot do binary search in a unsorted array
            * int[] data = {3, 2, 6, 1, 5, 8};
            * 
            * for(int i=0; i <data.length; i++)
            * {
            * 	if(data[i] == 1)
            *   {
            * 		System.out.println();
            * 	}
            * }
            * 
            * 
            * int [] data1 = {1, 2, 3, 4, 5, 6, 7};
            * 
            * */
       }

	   private static boolean checkPalindrome(String input) 
	   {
           // TODO Auto-generated method stub
		   // /2 throws an error for false output
           for(int i = 0, j = (input.length())-1; i < (input.length()) && j > -1; i++, j--) 
           {
        	   if(input.charAt(i) != input.charAt(j)) 
        	   {
        		   return false;
               }
           }
           
           return true;
	   }

}
