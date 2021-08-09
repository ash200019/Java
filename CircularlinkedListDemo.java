public class CircularlinkedListDemo
{
	public static void main(String args[])
	{
		CircularLinkedList<String>list = new CircularLinkedList<String>();
		String[]sob = {"mon","tue","wed","thur","fri","sat"};
		for(int i = 0 ; i < sob.length ; i++)
		{
			list.addLast(sob[i]);
		}
		for(int i = 0 ; i < sob.length ; i++)
			System.out.print(sob[i]+" ");
		System.out.println();
		System.out.println("Is the list empty? " + list.isEmpty());
		System.out.println("No of nodes : " + list.size());
		System.out.println("First element : " + list.first());
		System.out.println("Last element : " + list.last());
		for(int i = 1 ; i < sob.length ; i++)
		{
			System.out.print(list.removeFirst()+" ");
		}
		System.out.println();
	}
}
