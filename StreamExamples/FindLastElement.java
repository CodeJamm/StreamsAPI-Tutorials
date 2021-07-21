package StreamExamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindLastElement 
{
	public static void main(String[] args)
	{
		
		//using stream.reduce()
		Stream<Integer> stream1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        Integer lastElement1 = stream1.reduce((first, second) -> second).orElse(-1);
        System.out.println(lastElement1); 
        
        //or
        
        Stream<Integer> emptyStream = Stream.empty(); 
        Integer lastElement2 = emptyStream.reduce((first, second) -> second)
                        .orElseThrow(() -> new IllegalStateException("no last element"));
        System.out.println(lastElement2); 
        
	}
}