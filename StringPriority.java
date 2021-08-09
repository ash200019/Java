import java.util.PriorityQueue;
class StringPriority
{
	public static void main(String args[])
	{
		PriorityQueue<String>s = new PriorityQueue<>();
		s.add("Ash");
		s.add("May");
		s.add("Dawn");
		s.add("Brock");
		s.add("Pikachu");
		while(!s.isEmpty())
		{
			System.out.println(s.remove());
		}
	}
}
