// using random class

import java.util.Random;
class RandomDemo {
	
	public static void main(String [] args) {
			
		Random r = new Random();
		
		for(int i = 1; i <= 10; i ++)
			System.out.print(r.nextBoolean() + " ");
		System.out.println("\n");
		
		byte [] b = new byte [10];
		r.nextBytes(b);
			
		for(byte x : b)
			System.out.print(x + " ");
		System.out.println("\n");
		
		for(int i = 1; i <= 10; i++)
			System.out.print(r.nextInt() + " " + r.nextGaussian());
		System.out.println("\n");
		
		Random m = new Random(1715);
		Random n = new Random(9823);
		for(int i = 0; i < 10; i++)
			System.out.print(m.nextInt(1098) + " " + n.nextInt(4352));
		System.out.println("\n");
		
		n = new Random(1715);
		for(int i = 0; i < 10; i++)
			System.out.print(m.nextInt(999) + " " + n.nextInt(999));
		System.out.println("\n");
	}
}		
				
			
					
