public class ArrayQueueDemo {
/* Demonstrates a simple usage of a queue */
public static void main (String[] args){
Queue<Integer> Q = new ArrayQueue<>(50); // capacity is 50
Q.enqueue(5); Q.enqueue(3);
System.out.println(Q.size());
System.out.println(Q.dequeue());
System.out.println(Q.isEmpty());
System.out.println(Q.dequeue());
System.out.println(Q.isEmpty());
System.out.println(Q.dequeue());
Q.enqueue(7); Q.enqueue(9);
System.out.println(Q.first());
Q.enqueue(4);
System.out.println(Q.toString());
}
}
