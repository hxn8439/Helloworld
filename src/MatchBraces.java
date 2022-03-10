import java.util.*;
 
public class MatchBraces {
 
    static boolean braceMatched(String cha)
    {
        Stack<Character> stack = new Stack<>();
 
        for (int i = 0; i < cha.length(); i++)
        {
            char x = cha.charAt(i);
 
            if (x == '{')
            {
                stack.push(x);
                continue;
            }
 
            if (stack.isEmpty())
            {	
                return false;
            }
             
            if(x == '}')
            {
            	stack.pop();
            }	
            
            /*
            switch (x)
            {
            	case '}':
            		check = stack.pop();
            }*/
        }
 
        return (stack.isEmpty());
    }
 
    public static void main(String[] args)
    {
    	// TODO Auto-generated method stub

		System.out.println(braceMatched("{{}{}{}}")); // Should return true
		System.out.println(braceMatched("}{}{}{}{")); // Should return false
		System.out.println(braceMatched("{}{}{}{")); // Should return false
		System.out.println(braceMatched("{}}{{}")); //Should return false
		System.out.println(braceMatched("{{{{}}}{}{}}")); // Should return true
    }
}