//implementing selection sort

import java.util.Scanner;

class InsertionSort{
	int [] a;
	int n;
	
	InsertionSort(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		n = sc.nextInt();
		a = new int [n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter element " + i);
			a[i] = sc.nextInt();
		}
	}
	
	public void sort(){
		int i = 1;
		while(i < n){
			int j = 0;
			while(j < i){
				if(a[j] > a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j ++;
			}
			i ++;
		}
	}
	
	public void output(){
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}	


class InsertionSortDemo{
	public static void main(String [] args){
		SelectionSort s = new SelectionSort();
		s.sort();
		s.output();
	}
}
