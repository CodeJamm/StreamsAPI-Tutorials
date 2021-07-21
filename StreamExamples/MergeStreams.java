package StreamExamples;

import java.util.stream.Stream;

public class MergeStreams
{
	public static void main(String[] args) 
	{
		
		//Merging Two Streams
		Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);
        Stream.concat(firstStream, secondStream).forEach(e->System.out.print(e+" "));
        System.out.println();
        
        
        //Merging Multiple Streams
        Stream<Integer> first = Stream.of(1, 2);
        Stream<Integer> second = Stream.of(3,4);
        Stream<Integer> third = Stream.of(5, 6);
        Stream<Integer> fourth = Stream.of(7,8);
        Stream.concat(first, Stream.concat(second, Stream.concat(third, fourth)))
                     .forEach(e->System.out.print(e+" "));
        System.out.println();
        
        
        //Merging numbers with eliminating duplicate values
        Stream<Integer> Stream1 = Stream.of(1, 2, 3, 4, 8, 9);
        Stream<Integer> Stream2 = Stream.of(4, 5, 6, 1, 3, 4);
        Stream.concat(Stream1, Stream2).distinct().forEach(e->System.out.print(e+" "));
        System.out.println();
        
	}
}