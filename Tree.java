
import java.util.Scanner;
public class Tree{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		insert(arr);
	}
	
	public static void insert(int [] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root");
		a[0] = sc.nextInt();
		for(int i = 0; i < a.length; i++){
			System.out.println("Enter left: N to cancel");
			String x = sc.next();
			if(x.equals("N")) a[2 * i + 1] = -99;
			else a[2 * i + 1] = Integer.parseInt(x);
			System.out.println("Enter right: N to cancel");
			if(x.equals("N")) a[2 * i + 2] = -99;
			else a[2 * i + 2] = Integer.parseInt(x);
		}
		System.out.println(java.util.Arrays.toString(a));
	}
}
			
			
			
			
			
