package StreamsCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream 
{
	public static void main(String[] args)
	{
		//convert List of Integers to stream
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(System.out::print);
	}
}