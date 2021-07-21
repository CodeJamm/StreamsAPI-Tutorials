package StreamsCreation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreams 
{
	public static void main(String[] args)
	{
		//using stream.of() method
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
		
		//printing using Lambda Expression using forEach
		stream.forEach(System.out::println);
		
		//printing using stream.collect();
		System.out.println(stream.collect(Collectors.toList()));
		
		//printing using streams.peek()
		stream.peek(s->System.out.print(s+" ")).count();
		
		//printing using each elements in forEach 
		stream.forEach(e->System.out.print(e+" "));
	}
}