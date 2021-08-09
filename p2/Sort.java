import java.util.*;
public class Sort<E> {

    public static <E extends Comparable<E>> void bubbleSort(E[] a) {
        for(int i =1; i< a.length; i++){
            for(int j = 0; j < (a.length - i); j++){
                if((( (a[j])).compareTo(a[j+1])) > 0){
                    E tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }               
            }
        }
    }
    
    public static <E extends Comparable<E>> void selectionSort(E[] a)
    {
        for(int i=0; i<a.length -1; i++)
        {
            int iSmallest = i;

            for(int j=i+1; j<a.length; j++)
            {
                if(a[iSmallest].compareTo((a[j])) > 0  )
                {
                    iSmallest = j;
                }
            }
            E temp =a[iSmallest];
            a[iSmallest] = a[i];
            a[i] = temp;

        }
    }
    
    public static <E extends Comparable<E>> void insertionSort(E[] a) {
        
  
          for (int i = 1; i < a.length ; ++i) {
             for (int j = i ; j > 0; --j) {
                 if (a[j - 1].compareTo(a[j]) > 0) {
                     E temp = a[j - 1];
                     a[j - 1] = a[j];
                    a[j] = temp;
                 }
            }
         }
       }

    public static <E> void display1(E[] a) {
		System.out.print("\nThe Unsorted Array : ");
        for(E i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
     public static <E> void display2(E[] a) {
		System.out.print("\nThe Sorted Array : ");
        for(E i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
		System.out.print("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		System.out.print("\nEnter the  elements : ");
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		display1(a);
        System.out.println("\n1.Bubble Sort	2.Selection Sort	3.Insertion Sort\n");
        System.out.print("\nEnter Your Choice : ");
        int choice = sc.nextInt();
        switch(choice)
        {
			case 1:
				bubbleSort(a);
				display2(a);
				break;
			case 2:
				selectionSort(a);
				display2(a);
				break;
			case 3:
				insertionSort(a);
				display2(a);
				break;
		}
	}
}
