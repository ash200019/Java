
    import java.util.*;
    class Fibonacci
    {  
		 static int n1=0,n2=1,n3=0;    
		 static void FibonacciRec(int count)
		 {    
			if(count>0){    
				 n3 = n1 + n2;    
				 n1 = n2;    
				 n2 = n3;    
				 System.out.print(" "+n3);   
				 FibonacciRec(count-1);    
			 }    
		 } 
		 public static void fibonacci(int number) {
			

			System.out.printf("%nFibonacci series of %d numbers are : ", number);
			System.out.printf("%s ", n1);
			

			for (int i = 2; i < number; i++) {
				int fibonacci = n1 + n2;
				System.out.printf("%s ", fibonacci);
				n2 = n1;
				n1 = fibonacci;
        }
}



   
		 public static void main(String args[])
		 {
			 System.out.print("Enter the range : ");
			 Scanner sc = new Scanner(System.in);    
			  int count = sc.nextInt(); 
			  System.out.print("\n1.By Recursion	2.By Iteration\n");
				System.out.print("\nEnter your choice : ");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						System.out.print("\nFibonacci By Recursion : "+n1+" "+n2);//printing 0 and 1    
						FibonacciRec(count-2);//n-2 because 2 numbers are already printed   
						break;
					case 2:
						System.out.print("\nFibonacci by Iteration : ");//printing 0 and 1    
						fibonacci(count);
						break;
				} 
			  
		}  
    }  
