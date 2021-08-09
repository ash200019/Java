// implementing the singly linked list 

public class SinglyLinkedListDemo {
	public static void main(String [] args) {
		
		Integer [] in = {99, 45, 67, 34, 56, 12, 34, 78};
		
		SinglyLinkedList <Integer> list = new SinglyLinkedList <Integer>();
		System.out.println("" + list.isEmpty());
		for(int i = 0; i < in.length; i ++) {
			if(i % 2 == 1) list.addFirst(in[i]);
			else list.addLast(in[i]);
		}
	}
}	
		
