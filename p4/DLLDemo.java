public class DLLDemo {
public static void main(String[] args){
DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
Integer [] iob = {0,1,2,3,4,5,6,7,8,9};
for (int i = 0; i < iob.length; i++)
if (i % 2 == 0)
list.addFirst(iob[i]);
else
list.addLast(iob[i]);
list.searchNode(12);
System.out.println("Number of nodes in the list: " + list.size());
System.out.println("First element of the list: " + list.first());
System.out.println("Last elemetn of the list: " + list.last());
System.out.println("Elements of the list:");
System.out.println(list.toString());
// removing the first element from the list
list.removeFirst();
// removing the last element from the list
list.removeLast();
System.out.println("Elements of the list:");
System.out.println(list.toString());
System.out.println();
 list.searchNode(9);  
DoublyLinkedList<String> strList = new DoublyLinkedList<>();
String[] sob = {"mon","tue","wed","thu","fri","sat","sun"};
for (int i=0; i<sob.length; i++)
strList.addLast(sob[i]);
System.out.println("Number of nodes in the string list: " + strList.size());
System.out.println("Elements of the list:");
System.out.println(strList.toString());
System.out.println("Reverse List");
list.reverseList();
System.out.println(list);
 
}
}
