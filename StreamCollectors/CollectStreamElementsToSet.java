package StreamCollectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CollectStreamElementsToSet 
{
	public static void main(String[] args)
	{
		
		//convert stream to set
		List<Integer> list = Arrays.asList(1,2,3,4,5,4,5,8,9,10);
		Stream<Integer> stream = list.stream();
        
		Set<Integer> set = stream.collect(Collectors.toSet());
        System.out.println(set);
        
        //convert stream to an array and them array into set
        List<Integer> list1 = Arrays.asList(1,2,4,3,5,4,5,8,8,7);
		Stream<Integer> stream1 = list1.stream();
		
		Integer[] arr = stream1.toArray(Integer[]::new);
		
		//random order set
		Set<Integer> set1 = new HashSet<>();
		Collections.addAll(set1, arr);
		System.out.println(set1);
		
		//insertion order set
		Set<Integer> set2 = new LinkedHashSet<>();
		Collections.addAll(set2, arr);
		System.out.println(set2);
		
		//sorted order set
		Set<Integer> set3 = new TreeSet<>();
		Collections.addAll(set3, arr);
		System.out.println(set3);
	}
}