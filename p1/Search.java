import java.util.*;
public class Search {

    public static <T extends Comparable<T>> int binarySearch(T[] array, T value, int lo, int hi) {
	if (lo < hi) {
	    int mid = (lo / 2) + (hi / 2);
	    int cmp = array[mid].compareTo(value);
	    if (cmp < 0) return binarySearch(array, value, lo, mid - 1);
	    if (cmp > 0) return binarySearch(array, value, mid + 1, hi);
	    return mid;
	} 
	return -1;
    }

    public static <T extends Comparable<T>> int linearSearch(T[] array, T value, int lo, int hi) {
	for (int i = lo; i <= hi; i++) {
	    if (array[i].compareTo(value) == 0) return i;
	}
	return -1;
    }  
    public static void main(String args[])
    {
		System.out.println("Enter the size of them array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the lements of the array : ");
		for(int i = 1 ; i <= n ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element you wantr to search : ");
		int val = sc.nextInt();
		System.out.println("Choose : 1.Binary Search	2.Linear Search");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Binary Search : "+binarySearch(a , val , lo , hi));
				break;
			case 2:
				System.out.println("Binary Search : "+linearSearch(a , val , lo , hi));
				break;
		}
		
	}
}
