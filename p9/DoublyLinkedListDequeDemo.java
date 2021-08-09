public class DoublyLinkedListDequeDemo {
/* Demonstrates a simple usage of a deque */
public static void main (String[] args){
Deque<Integer> Q = new DoublyLinkedListDeque<>();

Q.addLast(5); Q.addFirst(3); Q.addFirst(7);
System.out.println(Q.first());
System.out.println(Q.removeLast());
System.out.println(Q.size());
System.out.println(Q.removeLast());
System.out.println(Q.removeFirst());
System.out.println(Q.removeFirst());
System.out.println(Q.removeLast());
System.out.println(Q.first());
System.out.println(Q.last());
System.out.println(Q.isEmpty());
Q.addFirst(6);
System.out.println(Q.last());
Q.addFirst(8);
System.out.println(Q.isEmpty());
Q.addLast(10);
System.out.println(Q.toString());
}
}
