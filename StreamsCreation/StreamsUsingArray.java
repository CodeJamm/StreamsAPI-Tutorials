package StreamsCreation;

import java.util.stream.Stream;

public class StreamsUsingArray 
{
	public static void main(String[] args) 
	{
		//using stream.of(array[])
		Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8});
		stream1.forEach(e->System.out.print(e+" "));
		System.out.println();
	}

}
