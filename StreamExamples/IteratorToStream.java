package StreamExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToStream 
{
	public static void main(String[] args) 
	{
		
		//JAVA 8
		
		Iterator<String> iterator1 = Arrays.asList("a", "b", "c").listIterator();
		
        //Extra step to get Spliterator
        Spliterator<String> splitItr = Spliterators
                .spliteratorUnknownSize(iterator1, Spliterator.ORDERED);

        // Iterator -> Stream
        StreamSupport.stream(splitItr, false).forEach(e->System.out.print(e+" "));
        System.out.println();
        
        
        
        //JAVA 9
        
        Iterator<String> iterator2 = Arrays.asList("a", "b", "c")
                .listIterator();
        Stream.generate(() -> null).takeWhile(x -> iterator2.hasNext())
                 .map(n -> iterator2.next()).forEach(e->System.out.print(e+" "));
        System.out.println();
        
	}
}