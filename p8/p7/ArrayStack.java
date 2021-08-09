public class ArrayStack<E>implements Stack<E>
{
	public static int CAPACITY = 1000;
	private E[]data;
	private int t = -1;
	public ArrayStack()	{this(CAPACITY);}	

	public ArrayStack(int capacity)	
	{
		data = (E[])new Object[capacity];
	}
	public int size()	{return (t + 1);}
	public boolean isEmpty()	{return (t == 0);}
	public void push(E e)throws IllegalStateException
	{
		if(size() == data.length)	throw new IllegalStateException("Stack is already full");
		data[++t] = e;
	}
	public E top()
	{
		if(isEmpty())	return null;
		return data[t];
	}
	public E pop()
	{
		if(isEmpty())	return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
	}
}
		

