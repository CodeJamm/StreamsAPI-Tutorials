package StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReuse 
{
	public static void main(String[] args) 
	{
		
		//reusing the stream created -> it can be reused by just creating a fresh stream for each time using stream()
		List<Integer> tokens = Arrays.asList(1, 2, 3, 4, 5);
        
        //first use
        Optional<Integer> result = tokens.stream().max(Integer::compareTo);
        System.out.println(result.get());
         
        //second use
        result = tokens.stream().min(Integer::compareTo);
        System.out.println(result.get());
         
        //third use
        long count = tokens.stream().count();
        System.out.println(count);
	}
}