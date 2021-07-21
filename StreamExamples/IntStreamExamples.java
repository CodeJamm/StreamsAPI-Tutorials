package StreamExamples;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class IntStreamExamples
{
	public static void main(String[] args) 
	{
		
		//IntStream.of() method -> creating an Intstream of data
		IntStream.of(1,2,3).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		
		//IntStream.range() method -> start inclusive and end exclusive
		IntStream.range(1, 5).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		
		//IntStream.rangeClosed() method -> both start and end are inclusive
		IntStream.rangeClosed(0, 4).forEach(e->System.out.print(e+" "));
	    System.out.println();
	    
	    
	    //IntStream.iterate() method -> acts like a loop
	    IntStream.iterate(0, i -> i + 2).limit(10).forEach(e->System.out.print(e+" "));
	    System.out.println();
	    
	    
	    //IntStream.generate() method -> generates n random numbers as mentioned in limit()
	    IntStream.generate(()->{return (int)(Math.random() * 10000);})
	               .limit(10).forEach(e->System.out.print(e+" "));
	    System.out.println();
	    
	    
	    //prints primes numbers within a given range by calling the isPrime function using lambda expression
	    IntStream.range(1, 100).filter(IntStreamExamples::isPrime).boxed()
                .collect(Collectors.toList()).forEach(e->System.out.print(e+" "));
	    System.out.println();
	    
	    
	    //IntStream to Array using toArray() method
	    int[] intArray = IntStream.of(1, 2, 3, 4, 5).toArray();
	    System.out.println(Arrays.toString(intArray));
	    
	    
	    //IntStream to list using toList() method -> boxed streams
	    List<Integer> ints = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());   
	    System.out.println(ints);
	    
	    
	    //IntStream to list using toList() method -> mapping integers to list
	    List<Integer> list = IntStream.of(1,2,3,4,5)
	            .mapToObj(Integer::valueOf).collect(Collectors.toList());
	    System.out.println(list);
	 
	}
	
	public static boolean isPrime(int i) 
    {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}