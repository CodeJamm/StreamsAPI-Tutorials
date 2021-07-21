package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileOperation
{
	public static void main(String[] args)
	{
		
		//In an ordered stream, takeWhile returns the “longest prefix” of elements taken from the stream that match the given predicate, starting at the beginning of the stream.
		//In an un-ordered stream, takeWhile returns a subset of the stream’s elements that match the given predicate (but not all), starting at the beginning of the stream.
		
		List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");		 
		List<String> subset1 = alphabets
		        .stream().takeWhile(s -> !s.equals("d"))
		        .collect(Collectors.toList());
		 
		System.out.println(subset1);
		
		//takewhile() takes till the given string in the list of strings
	}
}