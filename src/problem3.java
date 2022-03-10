
public class problem3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Given a sentence
		//String sentence = “racecar is driven by madam”;
		//Find the longest palindrome word in the sentence
		//Output: “racecar”
		
		String sentence = "racecar is driven by madam";
		
		longPal(sentence);
	}
	
	private static void longPal(String s)
	{
		//checking last word for palindrome
		s = s + " ";
		
		//storing each word 
		String longestS="";
		String wordS="";
		
		int length1 = 0;
		int length2 = 0;
		
		for(int i=0; i <s.length(); i++)
		{
			char cha =s.charAt(i);
			
			//taking each word, character by character
			if(cha !=' ')
			{
				wordS = wordS +cha;
			}
			
			else
			{
				length1 =wordS.length();
				if(checkPal(wordS) && length1 >length2)
				{
					length2 = length1;
					longestS = wordS;
				}	
				
				wordS = "";
			}	
		}	
		
		System.out.println(longestS);
	}
	
	//function to verify palindrome
	private static boolean checkPal(String s)
	{
		
		int a = s.length();
		
		//make string to lowerCase
		s = s.toLowerCase();
		
		//check each character from the beginning and last in a word
		for(int i=0; i <a; i++, a--)
		{
			if(s.charAt(i) != s.charAt(a-1))
			{
				return false;
			}	
		}	
		
		return true;
	}

}
