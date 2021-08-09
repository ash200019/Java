import java.util.*;
class TowerOfHanoi
{
	public static void main(String rags[])
	{
		System.out.println("Enter the no of disk : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		transfer(n , 'L' , 'R' , 'C');
	}
	static void transfer(int n , char from , char to , char temp)
	{
		if(n == 1)
		{
			System.out.println("Move disk 1 from " + from + " to "+to);
			return;
		}
		transfer(n-1 , from , temp , to);
		System.out.println("Move disk "+n + " from "+from+" to "+to);
		transfer(n-1 , temp , to , from);
	}
}
