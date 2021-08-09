public class DoublyLinkedListDemo<E>
{
	public static void main(String args[])
	{
		DoublyLinkedList<Integer>list = new DoublyLinkedList<Integer>();
				System.out.println("No of nodes : " + list.size());

		/*System.out.println(list.addFirst(5));
		System.out.println(list.addFirst(4));
		System.out.println(list.addFirst(2));
		System.out.println(list.addFirst(1));*/
		
		/*for(int i:iob)
			System.out.print(iob[i]+" ");
			* */
		System.out.println("Is the list empty? " + list.isEmpty());
		System.out.println("First element : " + list.first());
		System.out.println("Last element : " + list.last());
		/*for(int i = 1 ; i < iob.length ; i++)
		{
			System.out.println(list.removeFirst());
		}
		System.out.println();*/
		
	}
}

