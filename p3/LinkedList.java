public class LinkedList<E>
{
	private class Node<E>
	{
		private E element;
		private Node<E> next;
		
		public Node(E element , Node<E>next)
		{
			this.element = element;
			this.next = next;
		}
		
		public E getElement()	{return element;}
		public Node<E> getNext()	{return next;}
		public void setNext(Node<E>next)	{this.next = next;}
		private Node<E>head = null;
		private Node<E>tail = null;
		private int size = 0;
		
		public int size()	{return size;}
		public boolean isEmpty()	{return size == 0;}
		
		public E first()
		{
			if(isEmpty())	return null;
			return head.getElement();
		}
		
		public E last()
		{
			if(isEmpty())	return null;
			return tail.getElement();
		}
		
		public void addFirst(E e)
		{
			head = new Node<>(e , head);
			if(isEmpty())	tail = head;
			size++;
		}
		
		public void addLast(E e)
		{
			Node<E>newest = new Node<>(e , null);
			if(isEmpty())	head = newest;
			else tail.setNext(newest);
			tail = newest;
			size++;
		}
		
		public E removeFirst()
		{
			if(isEmpty())return null;
			E answer = head.getElement();
			head = head.getNext();
			size--;
			if(isEmpty())	tail = null;
			return answer;
		}
		
		public void reverse()
		{
			Node<E>prev = null;
			Node<E>current = head;
			Node<E>next = null;
			while(current != null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			tail = head;
			head = prev;
		}
		
		public void insert(E e , int n)
		{
			if(n > size || n < 1)
			{
				System.out.println("Error");
				return;
			}
			if(n == 1)
			{
				addFirst(e);
				return;
			}
		}
		
		public Integer search(E e)
		{
			if(isEmpty())	return null;
			Node<E>temp = head;
			int count = 1;
			while(temp != null)
			{
				if(temp.getElement() == e) return count;
				count++;
				temp = temp.getNext();
			}
			return null;
		}
		
		public LinkedList<E>concat(LinkedList<E>l)
		{
			if(isEmpty() && l.isEmpty())	return null;
			else if(isEmpty())	return l;
			else if(l.isEmpty())		return this;
			tail.setNext(l.head);
			tail = l.tail;
			return this;
		}
		
		public String toString()
		{
			if(isEmpty())	return null;
			Node<E>temp = head;
			String s = "[";
			while(temp != tail)
			{
				s += temp.getElement();
				temp = temp.getNext();
			}
			s+=temp.getElement() + "]";
			return s;
		}
	}
} 
	
