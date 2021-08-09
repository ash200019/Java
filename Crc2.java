/*import java.util.*;
class Crc2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the data : ");
		int n = sc.nextInt();
		int data[] = new int[n];
		System.out.println("Enter the data bit by bit : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Enter bit  " + (n-i)+": ");
			data[i] = sc.nextInt();
		}
		System.out.print("Enter the size of the divisor : ");
		n = sc.nextInt();
		int divisor[] = new int[n];
		System.out.println("Enter the divisor bit by bit : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Enter bit  " + (n-i) +": ");
			divisor[i] = sc.nextInt();
		}
		int remainder[] = divide(data , divisor);
		for(int i = 0 ; i < remainder.lenth - 1 ; i++)
		{
			System.out.print(remainder[i]);
		}
		System.out.println("The CRC generated code is : ");
		for(int i = 0 ; i < data.length ; i++)
		{
			System.out.print(data[i]);
		}
		for(int i = 0 ; i < remainder.lenth - 1 ; i++)
		{
			System.out.print(remainder[i]);
		}
		int sent_data = new int[data.length + remainder.length - 1];
		System.out.print("Enter the the sent data bit by bit ");
		for(int i = 0 ; i < sent_data.length ; i++)
		{
			System.out.print("Enter bit  " + sent_data.length-i +": ");
			sent_data[i] = scnextInt();
		}
		receive(sent_data , divisor);
	}
}*/
import java.util.*;
class Crc2
{
	public static void main(String rags[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the data : ");
		int n = sc.nextInt();
		int data[] = new int[n];
		//System.out.println("Enter the data bit by bit : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Enet bit " + (n - i) + ": ");
			data[i] = sc.nextInt();
		}
		System.out.print("Enter the size of the divisor : ");
		n = sc.nextInt();
		int divisor[] = new int[n];
		System.out.println("Enter the divisor bit by bit : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print("Enet bit " + (n - i) + ": ");
			divisor[i] = sc.nextInt();
		}
		int remainder[] = divide(data , divisor);
		for(int i = 0 ; i < remainder.length - 1 ; i++)
		{
			System.out.print(remainder[i] + " ");
		}
		System.out.println("The generated CRC Code is : ");
		for(int i = 0 ; i < data.length - 1 ; i++)
		{
			System.out.print(data[i] + " ");
		}
		for(int i = 0 ; i < remainder.length - 1 ; i++)
		{
			System.out.print(remainder[i] + " ");
		}
		int sent_data[] = new int[data.length + remainder.length - 1];
		System.out.println("Enter the sent data bit by bit : ");
		for(int i = 0 ; i < sent_data.length-1 ; i++)
		{
			System.out.print("Enter bit  "+ (sent_data.length - i) + ": ");
			sent_data[i] = sc.nextInt();
		}
		receive(sent_data , divisor);
	}
	static int[] divide(int old_data[], int divisor[]) {
		int remainder[] , i;
		int data[] = new int[old_data.length + divisor.length];
		System.arraycopy(old_data, 0, data, 0, old_data.length);
		// Remainder array stores the remainder
		remainder = new int[divisor.length];
		// Initially, remainder's bits will be set to the data bits
		System.arraycopy(data, 0, remainder, 0, divisor.length);
		
		// Loop runs for same number of times as number of bits of data
		// This loop will continuously exor the bits of the remainder and
		// divisor
		for(i=0 ; i < old_data.length ; i++) {
			System.out.println("First data bit is : "+ remainder[0]);
			System.out.print("Remainder : ");
			if(remainder[0] == 1) {
				// We have to exor the remainder bits with divisor bits
				for(int j=1 ; j < divisor.length ; j++) {
					remainder[j-1] = exor(remainder[j], divisor[j]);
					System.out.print(remainder[j-1]);
				}
			}
			else {
				// We have to exor the remainder bits with 0
				for(int j=1 ; j < divisor.length ; j++) {
					remainder[j-1] = exor(remainder[j], 0);
					System.out.print(remainder[j-1]);
				}
			}
			// The last bit of the remainder will be taken from the data
			// This is the 'carry' taken from the dividend after every step
			// of division
			remainder[divisor.length-1] = data[i+divisor.length];
			System.out.println(remainder[divisor.length-1]);
		}
		return remainder;
	}
	static int exor(int a , int b)
	{
		if(a == b) return 0;
		return 1;
	}
	static void receive(int data[] , int divisor[])
	{
		int remainder[] = divide(data , divisor);
		for(int i = 0 ; i < remainder.length ; i++)
		{
			if(remainder[i] != 0)
			{
				System.out.println("There is an error in annonymous data...");
				return ;
			}
		}
		System.out.println("Data is recived without error");
	}
}
