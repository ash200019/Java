class SelectionSort
{
	public static void main(String rags[])
	{
		int a[] = {10 , 50 , 20 , 60 , 25};
		selectionSort(a);
		for(int i = 0 ; i< a.length ; i++)
			System.out.print(" "+a[i]);
	}
	public static void selectionSort(int a[])
	{
		for(int i = 0 ; i < a.length - 1 ; i++)
		{
			int index = i;
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[j] < a[index])	index = j;
			}
			int temp = a[index] ; 
			a[index] = a[i];
			a[i] = temp;
		}
	}
}
