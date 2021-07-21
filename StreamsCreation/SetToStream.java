package StreamsCreation;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetToStream 
{
	public static void main(String[] args)
	{
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(2);
		
		Stream<Integer> stream = set.stream();
		stream.forEach(e -> System.out.print(e+" "));
	}
}