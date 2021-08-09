public class DoublyLinkedList<E> {
//---------------- nested Node class ----------------
private static class Node<E> {
private E element; // reference to the element stored at this node
private Node<E> prev; // reference to the previous node in the list
private Node<E> next; // reference to the subsequent node in the list
public Node(E e, Node<E> p, Node<E> n) {
element = e;
prev = p;
next = n;
}
// public accessor methods
public E getElement() { return element; }
public Node<E> getPrev() { return prev; }
public Node<E> getNext() { return next; }
// Update methods
public void setPrev(Node<E> p) { prev = p; }
public void setNext(Node<E> n) { next = n; }
} //----------- end of nested Node class -----------
// instance variables of the DoublyLinkedList
private Node<E> header; // header sentinel
private Node<E> trailer; // trailer sentinel
private int size = 0; // number of elements in the list
/** Constructs a new empty list. */
public DoublyLinkedList() {
header = new Node<>(null, null, null); // create header
trailer = new Node<>(null, header, null); // trailer is preceded by header
header.setNext(trailer); // header is followed by trailer
}

// public accessor methods
public int size() { return size; }
public boolean isEmpty() { return size == 0; }
public E first() {
if (isEmpty()) return null;
return header.getNext().getElement(); // first element is beyond header
}
public E last() {
if (isEmpty()) return null;
return trailer.getPrev().getElement(); // last element is before trailer
}
// public update methods
public void addFirst(E e) {
addBetween(e, header, header.getNext()); // place just after the header
}
public void addLast(E e) {
addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
}
public E removeFirst() {
if (isEmpty()) return null; // nothing to remove
return remove(header.getNext()); // first element is beyond header
}
public E removeLast() {
if (isEmpty()) return null; // nothing to remove
return remove(trailer.getPrev()); // last element is before trailer
}
// private update methods
private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
// create and link a new node
Node<E> newest = new Node<>(e, predecessor, successor);
predecessor.setNext(newest);
successor.setPrev(newest);
size++;
}
private E remove(Node<E> node) {
Node<E> predecessor = node.getPrev();
Node<E> successor = node.getNext();
predecessor.setNext(successor);
successor.setPrev(predecessor);
size--;
return node.getElement();
}
public void searchNode(E value) {  
        int i = 1;  
        boolean flag = false;  
       
        Node current = header;  
          
        
        if(header == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            
            if(current.element == value) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag)  
             System.out.println("Node is present in the list at the position : " + i);  
        else  
             System.out.println("Node is not present in the list");  
    }  
/**
* Produces a string representation of the contents of the list.
* This exists for debugging purposes only.
*/
public String toString() {
StringBuilder sb = new StringBuilder("(");
Node<E> walk = header.getNext();
while (walk != trailer) {
sb.append(walk.getElement());
walk = walk.getNext();
if (walk != trailer)

sb.append(", ");
}
sb.append(")");
return sb.toString();
}
public void reverseList(){
if (!isEmpty()) {
Node<E> temp = header;
header = trailer; trailer = temp;
Node<E> currNode = trailer;
do {
temp = currNode.getPrev();
currNode.setPrev(currNode.getNext());
currNode.setNext(temp);
currNode = currNode.getPrev();
} while (currNode != header);
temp = currNode.getPrev();
currNode.setPrev(currNode.getNext());
currNode.setNext(temp);
}
}
}
