package StreamExamples;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntPredicateExamples
{
	public static void main(String[] args)
	{
	
		//Java IntPredicate interface is a predicate of one int-valued argument. 
		//It can be considered an operator or function that returns a value either true or false based on certain evaluation on the argument int value.
        //IntPredicate is a functional interface whose functional method is boolean test(int a).
		
		IntPredicate isOdd = argument -> argument % 2 == 1;
		 
		
        //Use predicate directly
        System.out.println(isOdd.test(9));    //true
        System.out.println(isOdd.test(10));   //false
         
        
        //Use predicate in filters
        IntStream.range(1, 10).filter(isOdd).boxed()
                   .collect(Collectors.toList()).forEach(e->System.out.print(e+" "));
        System.out.println();
        
        
        //complex IntPredicate -> using logical AND, OR, etc...
        IntPredicate isOddNumber = argument -> argument % 2 == 1;
        IntStream.range(1, 20).filter(isOddNumber.and(IntPredicateExamples::isPrime))
                 .boxed()
                 .collect(Collectors.toList()).forEach(e->System.out.print(e+" "));
        
	}
	
	public static boolean isPrime(int i) 
    {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }
}