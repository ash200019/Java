//implementing selection sort

import java.util.Scanner;

class SelectionSort{
	int [] a;
	int n;
	
	SelectionSort(){
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
		int i = n - 1, j = 0, max, index;
		while(i > 0){
			max = a[0];
			index = 0;
			j = 1;
			while(j < n){
				if(a[j] > max){
					max = a[j];
					index = j;
				}
				j++;
			}
			a[index] = a[i];
			a[i] = max;
			i--;
			n--;
		}
	}
	
	public void output(){
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}	


class SelectionSortDemo{
	public static void main(String [] args){
		SelectionSort s = new SelectionSort();
		s.sort();
		s.output();
	}
}
