public class SinglyLinkedListDemo<E>
{
	public static void main(String args[])
	{
		SinglyLinkedList<Integer>list = new SinglyLinkedList<Integer>();
		Integer []iob = {0 , 1,2,3,4,5,6};
		for(int i = 0 ; i < iob.length ; i++)
		{
			list.addLast(iob[i]);
		}
		/*for(int i:iob)
			System.out.print(iob[i]+" ");
			* */
		System.out.println("Is the list empty? " + list.isEmpty());
		System.out.println("No of nodes : " + list.size());
		System.out.println("First element : " + list.first());
		System.out.println("Last element : " + list.last());
		for(int i = 1 ; i < iob.length ; i++)
		{
			System.out.println(list.removeFirst());
		}
		System.out.println();
		
	}
}
