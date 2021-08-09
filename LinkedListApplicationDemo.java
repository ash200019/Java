// assingment 3 demo

public class LinkedListApplicationDemo {
	
	public static void main(String [] args) {
		Singly<Integer> l1 = new Singly<>();
		for(int i = 13; i < 33; i = i + 3) l1.addFirst(i);
		for(int i = 99; i > 77; i = i - 4) l1.addLast(i);
		System.out.println(l1);	
		l1.insert(1, 17);
		l1.insert(4, 69);
		l1.insert(l1.size() + 1, 129);
		System.out.println(l1);	
		System.out.println(l1.delete(1));
		System.out.println(l1.delete(5));
		System.out.println(l1.delete(l1.size()));
		System.out.println(l1);
		System.out.println(l1.search(30));	
		Singly<Integer> l2 = new Singly<>();
		for(int i = 14; i < 33; i = i + 3) l2.addFirst(i);
		for(int i = 98; i > 77; i = i - 4) l2.addLast(i);
		System.out.println(l2);
		l1.concat(l2);
		System.out.println(l1);
		Singly<Integer> l3 = new Singly<>();
		System.out.println(l3);
		l3.concat(l1);
		System.out.println(l3);			
	}
}
			
