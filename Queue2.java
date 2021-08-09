public interface Queue2<E>
{
	public int size();
	public boolean isEmpty();
	public void enqueue();
	public E top();
	public E dequeue();
}
