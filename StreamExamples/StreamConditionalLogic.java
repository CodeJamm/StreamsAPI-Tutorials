package StreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamConditionalLogic 
{
	public static void main(String[] args)
	{
		
		//stream – if-else logic
		List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));    
		Consumer<Integer> action = i -> {
		    if(i % 2 == 0) {
		        System.out.println("Even number : " + i);
		    } else {
		        System.out.println("Odd  number : " + i);
		    }
		};
		numberList.stream().forEach(action);
		System.out.println();
		
		//stream if logic – lambda conditional filter
		Stream.of(1,2,3,4,5,6).filter(i -> i % 2 == 0).forEach(e->System.out.print(e+" "));
	}
}