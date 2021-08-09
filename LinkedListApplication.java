// Assignment 3

public class LinkedListApplication <E> {
	
	//creating a inner class node
	private static class Node <E> {
		private E element;
		private Node <E> next;
		
		public Node(E e, Node <E> n) {
			element = e;
			next = n;
		}
		
		public E getElement() {return element;}
		
		public Node <E> getNext() {return next;}
		
		public void setNext(Node <E> n) {next = n;}
		
	}
	
	private Node <E> head = null;
	private Node <E> tail = null;
	private int size = 0;
	
	public LinkedListApplication () {}
	
	public int size() {return size;}
	
	public boolean isEmpty() {return size == 0;}
	
	private E first() {
		if(isEmpty()) return null;
		return head.getElement();
	}
	
	private E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	private void addFirst(E e) {
		head = new Node <>(e, head);
		if(size() == 0) tail = head;
		size ++;
	}
	
	private void addLast(E e) {
		Node <E> newest = new Node <>(e, null);
		if(isEmpty()) head = newest;
		else tail.setNext(newest);
		tail = newest;
		size ++;
	}
	
	private E removeFirst() {
		if(isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size --;
		if(size == 0)
			tail = null;
		return answer;
	}
	
	public void insertion(E e, int n) {
		if(n == 0) addFirst(e);
		else if(n == size - 1) addLast(e);
		else if(n < size - 1 && n > 0){
			Node <E> x = head;
			int i = 0;
			while(i != n - 1){
				x = x.getNext();
				i ++;
			}
			Node <E> newest = new Node <>(e, null);
			newest.setNext(x.getNext());
			x.setNext(newest);
		}
		else return;
	}
	
	public E deletion(int n) {
		E var = null;
		if(n == 0) removeFirst();
		else if(n > size - 1) return var;
		else {
			int i = 0; 
			Node <E> x = head;
			while(i != n -1){
				x = x.getNext();
				i ++;
			}
			E temp = (x.getNext()).getElement();
			x.setNext((x.getNext()).getNext());
			return temp;
		}
		return var;
	}
	
	public int search(E e){
		if(isEmpty()) return null;
		else{
			Node <E> temp = head;
			for(int i = 0; i < size; i++){
				if(temp.getElement() == e) return i;
				else temp = temp.getNext();
			}
			return -1;
		}
	}
	
	public void reverse(){
		if(isEmpty()) return;
		Node <E> curr = head, prev = null, next = null;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		tail = head;
		head = prev;
	}
	
	 public String toString(){
		if(isEmpty()) return "null";
		else{
			StringBuilder sb= new StringBuilder("");
			Node <E> temp = head;
			for(;temp!=null;){
				sb.append(""+temp.getElement()+", ");
				temp = temp.getNext();
			}
			return sb.append("\b\b").toString();
		}
	}
}

