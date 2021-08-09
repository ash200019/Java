public interface Queue<E>
{
	int size();
	boolean isEmpty();
	void enque(E e);
	E deque();
	E first();
}
