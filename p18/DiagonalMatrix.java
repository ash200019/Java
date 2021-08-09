import java.util.Formatter;
import java.util.Scanner;
public class DiagonalMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Formatter fmt;
		int size = sc.nextInt();
		int[][]dm = new int[size][size];
		for(int i = 0 ; i < size ; i++)
			for(int j = 0 ; j < size ; j++)
				if(i == j)	dm[i][j] = sc.nextInt();
		int[]a = new int[size];
		for(int i = 0 ; i < size ; i++)
			a[i] = dm[i][i];
		System.out.println("Diagonal Matrix : ");
		for(int i = 0 ; i < size ; i++)
		{
			for(int j = 0 ; j < size ; j++)
			{
				fmt = new Formatter();
				fmt.format("%5d" , dm[i][j]);
				System.out.print(fmt);
				fmt.close();
			}
			System.out.println();
		}
		System.out.println("One diamentional Array corresponding Diagonal Matrix : ");
		for(int i = 0 ; i < size ; i++)
		{
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}
}
