// class implementing queue interface

public class ArrayQueue <E> implements Queue <E>{
	
	private int CAPA = 1000;
	private E [] data;
	private int f = 0;
	private int size = 0;
	
	//public ArrayQueue(){ this(CAPA);}
	
	@SuppressWarnings({"Unchecked"})
	public ArrayQueue(int cap){
		data = (E []) new Object[cap];
	}
	
	@Override
	public int size(){ return size;}
	
	@Override
	public boolean isEmpty(){ return (size == 0); }
	
	@Override
	public void enqueue(E e) throws IllegalStateException{
		if(size == data.length) throw new IllegalStateException("Ducked");
		int avail = (f + size) % data.length;
		data [avail] = e;
		size ++;
	}
	
	@Override
	public E dequeue(){
		if(isEmpty()) return null;
		E answer = data [f];
		data [f] = null;
		f = (f + 1) % data.length;
		size --;
		return answer;
	}
	
	@Override
	public E first(){
		if(isEmpty()) return null;
		return data [f];
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("(");
		int k = f;
		for(int i = 0; i < size; i++){
			if(i > 0)
				sb.append(",");
			sb.append( data[k]);
			k = (k + 1) % data.length;
		}
		sb.append(")");
		return sb.toString();
	}
	
}
				
	
	
		
		
