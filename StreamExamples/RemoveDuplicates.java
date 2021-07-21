package StreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates 
{
	public static void main(String[] args)
	{
		
		//using stream.distinct()
		List<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8)); 
		List<Integer> listWithoutDuplicates = numbersList1.stream()
		            .distinct().collect(Collectors.toList());
		System.out.println(listWithoutDuplicates);
		
		
		// using stream.toSet()
		List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		Set<Integer> setWithoutDuplicates = numbersList2.stream().collect(Collectors.toSet());
		System.out.println(setWithoutDuplicates);
		
		
		//using stream.toMap()
		List<Integer> numbersList3 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		Map<Integer, Long> elementCountMap = numbersList3.stream()
	            .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
	    System.out.println(elementCountMap);
	    
	}
}