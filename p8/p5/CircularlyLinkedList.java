public class CircularlyLinkedList<E> {
//---------------- nested Node class ----------------
private static class Node<E> {
private E element; // an element stored at this node
private Node<E> next;
private Node<E> prev; // a reference to the subsequent node in the list
public Node(E e, Node<E> n , Node<E> p) {
element = e;
next = n;
prev = p;
}
// Accessor methods
public E getElement() { return element; }
public Node<E> getNext() { return next; }
public Node<E> getPrev() { return prev; }
// Modifier methods
public void setNext(Node<E> n) { next = n; }
} //----------- end of nested Node class -----------
// instance variables of the CircularlyLinkedList
private Node<E> tail = null; // we store tail (but not head)
private int size = 0; // number of nodes in the list
/** Constructs an initially empty list. */
public CircularlyLinkedList() { } // constructs an initially empty list
// access methods
public int size() { return size; }
public boolean isEmpty() { return size == 0; }
public E first() { // returns (but does not remove) the first element
if (isEmpty()) return null;
return tail.getNext().getElement(); // the head is *after* the tail
}
public E last() { // returns (but does not remove) the last element
if (isEmpty()) return null;
return tail.getElement();
}
// update methods
public void rotate() { // rotate the first element to the back of the list
if (tail != null) // if empty, do nothing
tail = tail.getNext(); // the old head becomes the new tail
}
/*public void addFirst(E e) { // adds element e to the front of the list
if (size == 0) {
tail = new Node<>(e, null);
tail.setNext(tail); // link to itself circularly
} else {

Node<E> newest = new Node<>(e, tail.getNext());
tail.setNext(newest);
}
size++;
}*/
/*public void addLast(E e) { // adds element e to the end of the list
addFirst(e); // insert new element at front of list
tail = tail.getNext(); // now new element becomes the tail
}
public E removeFirst() { // removes and returns the first element
if (isEmpty()) return null; // nothing to remove
Node<E> head = tail.getNext();
if (head == tail) tail = null; // must be the only node left
else tail.setNext(head.getNext()); // removes "head" from the list
size--;
return head.getElement();
}
public void reverseList(){
if (tail == null) return; // list is empty
Node<E> prevNode = null, currNode = tail, nextNode = null;
Node<E> temp = tail.getNext();
do {
//Before changing next of currNode, store next Node
nextNode = currNode.getNext();
//Now change next of currNode
//This is when actual reversing happens
currNode.setNext(prevNode);
//Move prevNode and currNode one step forward
prevNode = currNode;
currNode = nextNode;
} while (currNode != tail);
tail.setNext(prevNode);
tail = temp;
}
/*public int searchList(E search)  
{  
    // Declare the temp variable  
    Node temp = start;  
      
    // Declare other control  
    // variable for the searching  
    int count = 0, flag = 0, value;  
      
    // If start is null return -1  
    if(temp == null)  
        return -1;  
    else
    {  
        // Move the temp pointer until,  
        // temp.next doesn't move  
        // start address (Circular Fashion)  
        while(temp.next != start)  
        {  
            // Increment count for location  
            count++;  
              
            // If it is found raise the  
            // flag and break the loop  
            if(temp.element == search)  
            {  
                flag = 1;  
                count--;  
                break;  
            }  
              
            // Increment temp pointer  
            temp = temp.next;  
        }  
          
        // Check whether last element in the  
        // list content the value if contain,  
        // raise a flag and increment count  
        if(temp.element== search)  
        {  
            count++;  
            flag = 1;  
        }  
          
        // If flag is true, then element  
        // found, else not  
        if(flag == 1)  
            System.out.println("\n"+search +" found at location "+  
                                            count);  
        else
            System.out.println("\n"+search +" not found");  
    }  
    return -1; 
}  */
static Node merge(Node a , Node b)
{
	if(a == null)	return b;
	if(b == null)	return a;
	if(a.element < b.element)
	{
		a.next = merge(a.next , b);
		a.next.prev = a;
		a.prev = null;
		return a;
	}
	else
	{
		b.next = merge(a , b.next);
		b.next.prev = b;
		b.prev = null;
		return b;
	}
}
public String toString() {
if (tail == null) return "()";
StringBuilder sb = new StringBuilder("(");
Node<E> walk = tail;
do {
walk = walk.getNext();
sb.append(walk.getElement());
if (walk != tail)
sb.append(", ");
} while (walk != tail);
sb.append(")");
return sb.toString();
}
}
