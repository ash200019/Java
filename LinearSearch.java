import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		int a[] = {10 , 20 , 50 , 30 , 70};
		System.out.println("Enter key : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println(key + "found at "+linearSearch(a, key));
	}
	public static int linearSearch(int []a , int key)
	{
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == key)	return i;
			
		}
		return -1;
	}
}
