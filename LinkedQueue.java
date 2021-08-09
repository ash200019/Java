public class LinkedQueue<E>implements Queue<E>
{
	public static int CAPACITY = 1000;
	private int f = 0;
	private int sz = 0;
	private E[]data;
	public LinkedQueue(){this(CAPACITY);}
	public LinkedQueue(int capacity){data = (E[])new Object[capacity];}
	public int size(){return sz;}
	public boolean isEmpty(){return (sz == 0);}
	public void enque(E e)throws IllegalStateException
	{
		if(sz == data.length)throw new IllegalStateException("Queue is full");
		else
		{
			int avail = (f + sz)% data.length;
			data[avail] = e;
		}
		sz++;
	}
	public E first()
	{
		if(isEmpty())	return null;
		return data[f];
	}
	public E deque()
	{
		if(isEmpty())return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
}
