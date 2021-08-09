import java.util.*;
class Factorial_fact
{
	public static void main(String args[])
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("\n1.Recursion	2.Iteration\n");
		System.out.print("\nEnter your choice : ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("\nFactorial by recursion : "+factRec(n));
				int count=2;
				factorRec(n, count);
				break;
			case 2:
				System.out.println("\nFactorial by Iteration : "+factItr(n));
				factorItr(n);
		}
	}
	
	public static void factorRec(int num, int count)
{ 
	 
    if (num == 1)
        return;

    if((num%count)==0)
    {
        System.out.print(count+ " * ");
       num = num/count;
    }
    else 
        factorRec(num,count+1);
    }

	
	public static int factRec(int n)
	{
		if(n == 0)	return 1;
		else return n * factRec(n - 1);
	}
	
	public static int factItr(int n)
	{
		int f = 1;
		for(int i = 1 ; i <= n ; i++)
		{
			f = f*i;
		}
		return f;
	}
	
	public static void factorItr(int n)
	{
		System.out.print("Factors of " + n + " in Iteration are: ");
        for(int i = 2; i <=(n); ++i) 
        {
            if (n % i == 0) 
            {
				
                System.out.print(i + " * " + (n/i) + " , ");
            }
        }
	}
	
}

				
		
		
