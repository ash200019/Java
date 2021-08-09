//implementing bubble sort

import java.util.Scanner;

class BubbleSort{
	public int [] a;
	public int n;
	
	BubbleSort(){
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
		int i = 0, j = 0;
		while(i < n){
			j = 0;
			while(j < n - i - 1){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				j ++;
			}
			i ++;
		}
	}
	
	public void output(){
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}		
}

class BubbleSortDemo{
	
	public static void main(String [] args){
		BubbleSort b = new BubbleSort();
		b.sort();
		b.output();
	}
} 
		
