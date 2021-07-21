package StreamCollectors;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class CollectStreamElementsToArray 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        for(Integer num:evenNumbersArr)
        {
        	System.out.print(num+" ");
        }
	}
}