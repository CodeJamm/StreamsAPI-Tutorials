package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileOperation 
{
	public static void main(String[] args) 
	{
		
		//In an ordered stream, dropWhile returns remaining items after the “longest prefix” that match the given predicate.
		//In an un-ordered stream, dropWhile returns remaining stream elements after dropping subset of elements that match the given predicate.
		
		List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
		List<String> subset2 = alphabets
		        .stream().dropWhile(s -> !s.equals("d"))
		        .collect(Collectors.toList());
		 
		System.out.println(subset2);
		
		//dropsDown() prints everything after the given string in the list of strings
	}
}