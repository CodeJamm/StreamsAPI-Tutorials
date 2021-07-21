package StreamExamples;

import java.util.stream.Stream;

public class FixedLengthStream 
{
	public static void main(String[] args)
	{
		Stream.Builder<Integer> streamBuilder = Stream.builder();
	    streamBuilder.accept(1);
	    streamBuilder.accept(2);
	    streamBuilder.accept(3);
	    streamBuilder.accept(4);
	    streamBuilder.accept(5);
	    streamBuilder.build().forEach(e->System.out.print(e+" ")); 
	}
}