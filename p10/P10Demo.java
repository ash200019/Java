public class P10Demo {
	
	public static void main(String [] args) {
		P10 p1 = new P10();
		P10 p2 = new P10();
		for(int i = 7; i > 3; i--) p2.insert(i * 2, i);
		for(int i = 8; i >= 1; i--) p1.insert(i * 3, i);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.add(p2));
	}
} 
