import java.util.Scanner;

public class SwappableNum {
	
	//make two int variables global
	int a,b;

	public void swapNumber(SwappableNum obj)
	{
		
		int temp;
		temp = obj.a;
		obj.a = obj.b;
		obj.b = temp;
		
		//System.out.printf("after swap x=%d y=%d", x, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x =5, y =6;
		
		//System.out.printf("before swap x=%d y=%d", x, y);
		
		//System.out.printf("\n");
		
		//swapNumber(x,y);
		
		//System.out.printf("\n outside scope swap x=%d y=%d", x, y);
		
		/* Java is passing by value and not passing by reference. The swapNumber
		*method will not change the actual value of x and y. To performed the swap,
		* print the statement inside the function since it will be successful within the scope of the method.
		* In order to pass by reference, create a scanner object and create SwappableNum object.
		* 
		*/
		
		//create object of a SwappableNum class.
		SwappableNum swap = new SwappableNum();
		
		//create object of a scanner class.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		swap.a = sc.nextInt();
		System.out.print("Enter the second number: ");
		swap.b = sc.nextInt();
		
		System.out.println("Before swapping: a= " + swap.a + ", b= " + swap.b);
		//function calling
		swap.swapNumber(swap);
		
		//prints result after swapping
		System.out.println("After swapping: a= " + swap.a + ", b= " + swap.b);
		sc.close();
		
	}

	
}
