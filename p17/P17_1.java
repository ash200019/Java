
public class P17_1<E>{
	private static class Node<E>{
		private E data;
		private Node<E> next;
		public Node(E value,Node<E>newNode){
			data=value; 
			next=newNode;
		}
		public E getData(){return data;}
		public Node<E>getNext(){return next;}
		public void setNext(Node<E> newNode){next=newNode;}
	}
	
	private Node<E> head=null;
	private Node<E> tail=null;
	private int size=0;
	
	public P17_1(){}
	
	public int size(){return size;}

	public boolean isEmpty(){return size==0;}
	
	public void push(E e){
		head=new Node<>(e,head);
		if(isEmpty())
			tail=head;
		size++;
	}
	
	public E pop(){
		if(isEmpty())
			return null;
		E answer=head.getData();
		head=head.getNext();
		size--;
		if(isEmpty())
			tail=null;
		return answer;
	}

	public void getlist(){
		Node<E> current=head;
		while(current!=null){
			System.out.println(current.getData()+" ");
			current=current.getNext();
		}
		System.out.println();
	}

	public E topValue(){
		if(isEmpty())
			return null;
		else
			return head.getData();
	}
	
}