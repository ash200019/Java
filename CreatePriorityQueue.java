/* Creating a Priority Queue */

import java.util.PriorityQueue;
class CreatePriorityQueue
{
	public static void main(String args[])
	{
		PriorityQueue<Integer>numbers = new PriorityQueue<>();
		numbers.add(500);
		numbers.add(600);
		numbers.add(700);
		numbers.add(800);
		while(!numbers.isEmpty())
		{
			System.out.println(numbers.remove());
		}
	}
}
