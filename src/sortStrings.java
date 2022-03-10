import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class sortStrings {
	
	public static void main(String[] args) {

		//sort Strings alphabetically if length is same 
		String[] arr = {"Krishna", "Aditya", "Vani", "Joseph", "Josiph", "Brilna", "Jak"};
		
		System.out.println("Unordered array ***********" );
		for(String str : arr) {
			System.out.println(str);
		}
		
		//O complexity for this is O(n)
		System.out.println("Linear Search *********** " + linSearch(arr, "Aditya") );
		System.out.println("Linear Search *********** " + linSearch(arr, "Hadi") );

		Arrays.sort(arr);
		System.out.println("Ordered array ***********" );
		for(String str : arr) {
			System.out.println(str);
		}
		
		//O complexity for this is O(n)
		System.out.println("Linear Search *********** " + linSearch(arr, "Aditya") );
		System.out.println("Linear Search *********** " + linSearch(arr, "Hadi") );
		
		//O complexity for this is O(log(n))
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Aditya") );
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Vani") );
		System.out.println("Binary Search *********** " + Arrays.binarySearch(arr, "Hadi") );
		
		Arrays.sort(arr, new LengthComparator());
		System.out.println("Length ordered array ***********" );
		for(String str : arr) {
			System.out.println(str);
		}
	}

	//linsearch
	private static int linSearch(String[] arr, String key) {
		// TODO Auto-generated method stub
		int idx = 0;
		for(String k: arr) {
			if(k.equals(key)) {
				return idx;
			}
			idx++;
		}
		return -1;
	}
}


//problem 6: sorting
class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int result = o2.length() - o1.length();
		if(result == 0) {
			/*int i = 0;
			while(result == 0 && i < o1.length()) {
				result = o1.charAt(i) - o2.charAt(i);
				i++;
			}*/	
			return o1.compareTo(o2);
		}
		return result;
	}
}
