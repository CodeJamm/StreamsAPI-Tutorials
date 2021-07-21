package StreamsCreation;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharactersAndTokens
{
	public static void main(String[] args) 
	{
		//convert stream of characters to integer
		IntStream stream = "12345_abcde".chars();
		stream.forEach(e->System.out.print(e+" "));
		System.out.println("\n");
		
		//convert the stream by splitting up the given string with tokens
		Stream<String> stream1 = Stream.of("A$B$C$".split("\\$"));
		stream1.forEach(e->System.out.print(e+" "));
	}
}