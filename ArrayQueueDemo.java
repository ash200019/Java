
public class ArrayQueueDemo{
	public static void main(String [] args){
		ArrayQueue <Integer> q = new ArrayQueue <>(7);
		q.enqueue(40);
		q.enqueue(88);
		q.enqueue(1436);
		q.enqueue(6485);
		System.out.println(q.size());
		System.out.println(q.first());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(45);
		q.enqueue(88);
		q.enqueue(1436);
		q.enqueue(6485);
		System.out.println(q.toString());
	}
}
		
		
