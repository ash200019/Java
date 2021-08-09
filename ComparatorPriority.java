import java.util.Comparator;
import java.util.PriorityQueue;
public class ComparatorPriority
{
	public static void main(String args[])
	{
		Comparator<String>lengthComparator = new Comparator<String>()
		{
			public int compare(String s1 , String s2)
			{
				return s1.length() - s2.length();
			}
		};
		
		PriorityQueue<String>s = new PriorityQueue<>(lengthComparator);
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

