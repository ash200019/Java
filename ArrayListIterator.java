// implementing ListIterator interface

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayListIterator <E> implements ListIterator <E>{
	
	public static final int CAP = 16;
	private E[] data;
	private int size = 0;
	
	public ArrayListIterator(){this(CAP);}
	
	@SuppressWarnings({"unchecked"})
	public ArrayListIterator(int cap){
		data = (E[]) new Object[cap];
	}
	
	public int size(){return size;}
	
	public boolean isEmpty(){return size == 0;}
	
	public E get(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		return data[i];
	}
	
	public E set(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	} 
	
	public void add(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i, size + 1);
		if(size == data.length) resize(2 * data.length);
		for(int k = size - 1; k >= i; k--)
			data[k + 1] = data[k];
		data[i] = e;
		size ++;
	}
	
	public E remove(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		for(int k = i; k < size - 1; k++)
			data[k] = data[k + 1];
		data[size - 1] = null;
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
		if(i < 0 || i >= n) throw new IndexOutOfBoundsException("Illegal index " + 1);
	}
	
	@SuppressWarnings({"unchecked"})
	protected void resize(int capa){
		E[] temp = (E[]) new Object[capa];
		for(int k = 0; k < size; k++)
			temp[k] = dat[k];
		data = temp;
	}
	
	private class ArrayIterator implements Iterator <E>{
		
		private int j = 0;
		private boolean removable = false;
		
		public boolean hasNext(){return j <= size;}
		
		
		
		 
		
		
	
			
