public class DoublyLinkedList<E>implements Deque<E>
{
	public class Node<E>
	{
		private E element;
		private Node<E>prev;
		private Node<E>next;
		public Node(E e , Node<E>p , Node<E>n)
		{
			element = e;
			prev = p;
			next = n;
		}
		public E getElement()	{return element;}
		public Node<E> getPrev()	{return prev;}
		public Node<E> getNext()	{return next;}
		public void setPrev(Node<E>p)	{prev = p;}
		public void setNext(Node<E>n)	{next = n;}
	}
	private Node<E>header;
	private Node<E>trailer;
	private int size = 0;
	public DoublyLinkedList()
	{
		header = new Node<>(null , null , null);
		trailer = new Node<>(null , header , null);
	}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E first()
	{
		if(isEmpty())	{return null;}
		return header.getNext().getElement();
	}
	public E last()
	{
		if(isEmpty())	{return null;}
		return trailer.getPrev().getElement();
	}
	public void addFirst(E e)
	{
		addBetween(e , header , header.getNext());
	}
	public void addLast(E e)
	{
		addBetween(e , trailer.getPrev() ,trailer);
	}
	/*public E removeFirst()
	{
		if(isEmpty())	{return null;}
		remove(header.getNext());
	}
	public E removeLast()
	{
		if(isEmpty())	{return null;}
		remove(trailer.getPrev());
	}*/
	public void addBetween(E e , Node<E>pred , Node<E>succ)
	{
		Node<E>newest = new Node<>(e , pred , succ);
		pred.setNext(newest);
		succ.setNext(newest);
		size++;
	}
}
