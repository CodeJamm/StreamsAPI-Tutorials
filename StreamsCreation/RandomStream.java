package StreamsCreation;

import java.util.Random;
import java.util.stream.Stream;

public class RandomStream 
{
	public static void main(String[] args)
	{
		//generate a stream of random numbers using stream.random() or stream.iterate()
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
			    
		//limiting that random numbers 
		randomNumbers.limit(20).forEach(ele -> System.out.print(ele+" "));
	}
}