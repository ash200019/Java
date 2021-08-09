import java.util.Formatter;
import java.util.Scanner;
public class UpperTriangular
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Formatter fmt;
		int size = sc.nextInt();
		int[][]utm = new int[size][size];
		for(int i = 0 ; i < size ; i++)
			for(int j = 0 ; j < size ; j++)
				if(i  <= j)	utm[i][j] = sc.nextInt();
		int aSize = size * (size + 1) / 2;
		int[]a = new int[aSize];
		int k = -1;
		for(int i = 0 ; i < size ; i++)
			for(int j = 0 ; j  < size ; j++)
				if(i <= j)	a[++k] = utm[i][j];
		System.out.println("Upper Triangular Matrix : ");
		for(int i = 0 ; i < size ; i++)
		{
			for(int j = 0 ; j < size ; j++)
			{
				fmt = new Formatter();
				fmt.format("%5d" , utm[i][j]);
				System.out.print(fmt);
				fmt.close();
			}
			System.out.println();
		}
		System.out.println("One-D array corresponding lower Triangular matrix :");
		for(int i = 0 ; i < aSize ; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
}
		
