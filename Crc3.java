import java.util.*;
class Crc3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the data : ");
		int n = sc.nextInt();
		int data[]= new int[n];
		System.out.println("Enter thre data bit by bit : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter bit "+(n-i)+": ");
			data[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of the divisor : ");
		n = sc.nextInt();
		int divisor[]= new int[n];
		System.out.println("Enter thre divisor bit by bit : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter bit "+(n-i)+": ");
			divisor[i] = sc.nextInt();
		}
		
		int remainder[] = divide(data , divisor);
		for(int i = 0 ; i < remainder.length - 1 ; i++)
		{
			System.out.print(remainder[i]);
		}
		
		System.out.println("The CRC generated code is : ");
		for(int i = 0 ; i < data.length ; i++)
		{
			System.out.print(data[i]);
		}
		
		for(int i = 0 ; i < remainder.length - 1 ; i++)
		{
			System.out.print(remainder[i]);
		}
		
		System.out.println();
		
		int sent_data[] = new int[data.length + remainder.length - 1];
		System.out.println("Enter thre data to be sent ,  bit by bit : ");
		for(int i = 0 ; i < sent_data.length ; i++)
		{
			System.out.println("Enter bit "+(sent_data.length-i)+": ");
			sent_data[i] = sc.nextInt();
		}
		
		receive(sent_data , divisor);
	}
	
	static int[]divide(int[]old_data , int[]divisor)
	{
		int remainder[] , i;
		int data[] = new int[old_data.length + divisor.length];
		System.arraycopy(old_data , 0 , data , 0 , old_data.length);
		remainder = new int[divisor.length];
		System.arraycopy(data , 0 , remainder , 0 , divisor.length);
		for(i = 0 ; i < old_data.length ; i++)
		{
			System.out.print("\nThe first bit of remainder : "+remainder[0]);
			System.out.print("\nRemainder : ");
			if(remainder[0] == 1)
			{
				for(int j = 1 ; j < divisor.length ; j++)
				{
					remainder[j - 1] = exor(remainder[j] , divisor[j]);
					System.out.print(remainder[j - 1]);
				}
			}
			else
			{
				for(int j = 1 ; j < divisor.length ; j++)
				{
					remainder[j - 1] = exor(remainder[j] , 0);
					System.out.print(remainder[j - 1]);
				}
			}
			
			remainder[divisor.length - 1] = data[i + divisor.length];
			System.out.println(remainder[divisor.length - 1]);
		}
		return remainder;
	}
	
	static int exor(int a , int b)
	{
		if(a == b)	return 0;
		return 1;
	}
	
	static void receive(int[]data ,int[]divisor)
	{
		int remainder[] = divide(data , divisor);
		for(int i = 0 ; i < remainder.length ; i++)
		{
			if(remainder[i] != 0)
			{
				System.out.println("Error in received data!!");
				return;
			}
		}
		System.out.println("Correct");
	}
}
	
