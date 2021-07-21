package StreamExamples;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class IterableToStream
{
	public static void main(String[] args) 
	{
		
		Iterable<String> iterable = Arrays.asList("a", "b", "c");  
		
        //Iterable -> Stream
        //false means sequential stream
        StreamSupport.stream(iterable.spliterator(), false).forEach(e->System.out.print(e+" "));
        
	}
}