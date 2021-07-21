package StreamCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CollectsreamElementsToList 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> stream = list.stream();

		List<Integer> evenNumbersList = stream.collect(Collectors.toList());
        System.out.print(evenNumbersList);
	}
}