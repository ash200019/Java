public class Sll<E>
{
	private class Node<E>
	{
		private E element;
		private Node<E>next;
		public Node(E e , Node<E>n)
		{
			element = e;
			next = n;
		}
		public E getElement(){return element;}
		public Node<E>getNext() {return next;}
		public void setNext(Node<E>n){next = n;}
	}
	private Node<E>head = null;
	private Node<E>tail = null;
	private int size = 0;
	public Sll(){}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E first(){
		if(isEmpty())return null;
		return head.getElement();
	}
	public E last(){
		if(isEmpty())return null;
		return head.getElement();
	}
	public void addFirst(E e)
	{
		head = new Node<>(e , head);
		if(isEmpty())tail = head;
		size++;
	}
	public void addLast(E e)
	{
		Node<E>newest = new Node<>(e , null);
		if(isEmpty())tail = head;
		tail.setNext(newest);
		tail = newest;
		size++;
	}
	public E removeFirst()
	{
		if(isEmpty())return null;
		E answer = head.getElement();
		head = head.getNext();
		if(isEmpty())tail = null;
		size--;
		return null;
	}
	public void reverse()
	{
		Node<E>prev = null;
		Node<E>current = head;
		Node<E>next= null;
		while(current !=null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = prev;
		}
		tail = head;
		head = prev;
	}
	public Integer search(E e)
	{
		if(isEmpty())return null;
		Node<E> temp = head;
		int count = 1;
		while(temp != null)
		{
			if(temp.getElement() == e)return count;
			count++;
			temp = temp.getNext();
		}
		return null;
	}
}
			
