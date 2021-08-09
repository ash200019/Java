//interface of list

public interface List <E>{
	int size();
	
	boolean isEmpty();
	
	E get(int i) throws IndexOutOfBoundsException;
	
	void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException;
	
	E remove(int i, E e) throws IndexOutOfBoundsException;
	
	E set(int i, E e) throws IllegalStateException;
}
