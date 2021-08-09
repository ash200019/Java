// main class

public class ArrayListDemo{
	
	public static void main(String [] args){
		List <Character> list = new ArrayList<>();
		list.add(0, 'e');
		list.add(0, 'p');
		list.add(1, 'q');
		
		System.out.println(list.get(0));
		
		list.add(2, 's');
		list.add(2, 't');
		list.add(2, 'r');
		list.add(2, 'o');
		list.add(2, 'n');
		list.add(2, 'g');
		
		System.out.print(list);
	}
}
		
