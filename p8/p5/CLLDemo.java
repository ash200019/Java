public class CLLDemo {
public static void main(String[] args){
CircularlyLinkedList<String> strList = new CircularlyLinkedList<>();
String[] sob = {"mon","tue","wed","thu","fri","sat","sun"};
for (int i=0; i<sob.length; i++)
strList.addLast(sob[i]);
searchList(start, "mon"); 
System.out.println("Number of nodes in the string list: " + strList.size());
System.out.println("Elements of the list:");
System.out.println(strList);
System.out.println("Reversing the list:");
strList.reverseList();
System.out.println(strList);
System.out.print("Removing the first element: ");
System.out.println(strList.removeFirst());
System.out.println("Now the list is:");
System.out.println(strList);
System.out.println();
}
}

