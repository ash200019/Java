import java.util.*;
class Gcd
{
	public static void main(String args[])
	{
		int a , b , choice;
		System.out.print("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("\n1.By Recursion	2.By Iteration\n");
		System.out.print("\nEnter your choice : ");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("\nGCD by Recursion = "+gcdRec(a , b));
				break;
			case 2:
				System.out.println("\nGCD by Iteration = "+gcdItr(a , b));
				break;
		}
	}
	public static int gcdRec(int a, int b) 
	{ 
        if (a == 0) 
       return b; 
		if (b == 0) 
		   return a; 
		if (a == b) 
			return a; 
	   
		// a is greater 
		if (a > b) 
			return gcdRec(a-b, b); 
		return gcdRec(a, b-a); 
	}
	public static int gcdItr(int a,int b)
	{
		while (b > 0)
		{
			int temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
   }
			
} 
		
