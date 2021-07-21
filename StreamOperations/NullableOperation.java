package StreamOperations;

import java.util.stream.Stream;

public class NullableOperation 
{
	public static void main(String[] args)
	{
		
		//if the stream has elements, it returns 1. else if it has null, it returns 0
		Stream<String> stream = Stream.ofNullable("123");
		System.out.println(stream.count());
		
		stream = Stream.ofNullable(null);
		System.out.println(stream.count());
		
		//Until Java 8, you cannot have null value in a stream. 
		//It would have caused NullPointerException.
        //In Java 9, the ofNullable method lets you create a single-element stream which wraps a value if not null, or is an empty stream otherwise.
	
	}
}