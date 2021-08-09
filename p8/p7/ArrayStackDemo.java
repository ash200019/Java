public class ArrayStackDemo
{
	public static void main(String rags[])
	{
		Stack<Integer>s = new ArrayStack<>();
		s.push(7);
		s.push(8);
		s.push(5);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}
}

