// Implementing linear search algorithm 

import java.util.Scanner;

class Search {
	int [] a;
	int n;
	int key;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int [n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		key = sc.nextInt();
	}
	
	void searching() {
		int flag = 0, count = 0;
		while(count < n) {
			if(a[count] == key) {
				flag = 1;
				System.out.println("Found at " + count);
				break;
			}
			count ++;
		}
		if(flag == 0) System.out.println("Not found");
	}
}	

public class LinearSearch {		
	public static void main(String [] args) {
		Search n = new Search();
		n.input();
		n.searching();
	}
}
