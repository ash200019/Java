// List class

public class ArrayList <E> implements List <E>{
	private static final int CAP = 1000;
	private int size = 0;
	private E [] data;
	
	public ArrayList(){this(CAP);}
	
	@SuppressWarnings({"unchecked"})
	public ArrayList(int c){ data = (E [])new Object [c];}
	
	@Override
	public int size(){return size;}
	
	@Override
	public boolean isEmpty(){return (size == 0);}
	
	@Override
	public E get(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		return data[i];
	}
	
	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
	
	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException{
		checkIndex(i, size + 1);
		if(size == data.length) throw new IndexOutOfBoundsException("Array full");
		for(int k = size - 1; k >= i; k--){
			data[k] = data[k+1];
			data[i] = e;
			size ++;
		}
	}
	
	@Override
	public E remove(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		for(int k = i; k < size - 1; k++){
			data[k] = data[k+1];
			data[size] = null;
			size --;
		}
		return temp;
	}
	
	private void checkIndex(int i, int n) throws IndexOutOfBoundsException{
		if(i < 0 || i >= n) throw new IndexOutOfBoundsException("Duck");
	}
	
	public String toString(){
		return (java.util.Arrays.toString(data));
	}
	
		
}
		 
		
		
	
