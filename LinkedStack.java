public class LinkedStack<E>implements Stack<E>
{
	private SinglyLinkedList<E>l = new SinglyLinkedList<>();
	public LinkedStack(){}
	public int size(){return l.size();}
	public boolean isEmpty(){return l.isEmpty();}
	public void push(E e){l.addFirst(e);}
	public E top(){return l.first();}
	public E pop(){return l.removeFirst();}
}
