public class Sort<E>
{
	public static<E extends Comparable <E>>void bubbleSort(E a[])
	{
		for(int i = 1 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a.length-1 ; j++)
			{
				if((( (a[j])).compareTo(a[j+1])) > 0)
				{
					E temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static<E extends Comparable <E>>void selectionSort(E a[])
	{
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int iSmallest = i;
			for(int j = i+1 ; j < a.length ; j++)
			{
				if((a[iSmallest].compareTo(a[j])) > 0)	iSmallest = j;
				E temp = a[iSmallest];
				a[iSmallest] = a[j];
				a[j] = a[iSmallest];
			}
		}
	}
	public static<E extends Comparable <E>>void insertionSort(E a[])
	{
		for(int i = 1 ; i < a.length ; i++)
		{
			for(int j = i ; j > 0 ; j--)
			{
				if((a[j-1].compareTo(a[j])) > 0)
				{
					E temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static<E> void display(E[]a)
	{
		for(E i : a)	
		{
			System.out.print(" "+i);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Integer[]a = {5 , 3 , 2, 1};
		bubbleSort(a);
		display(a);
		
		selectionSort(a);
		display(a);
		
		insertionSort(a);
		display(a);
	}
}
