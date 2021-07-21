package StreamCollectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingStream 
{
	public static void main(String[] args) 
	{
		//convert stream into set
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = list.stream();
        
        //ascending sort
		stream1.sorted().forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//descending sort
		stream2.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e+" "));
		System.out.println();
	}
}