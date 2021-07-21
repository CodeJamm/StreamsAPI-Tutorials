package StreamOperations;

import java.util.stream.Stream;

public class IterateOperation 
{
	public static void main(String[] args) 
	{
		//prints EVEN numbers
		Stream.iterate(0, n -> n<=20, n -> n + 2).forEach(e->System.out.print(e+" "));
		System.out.println("\n");
		
		//prints ODD numbers only
		Stream.iterate(0, n -> n + 1).filter(x -> x % 2 != 0).limit(10)
                  .forEach(x -> System.out.print(x+" "));
		System.out.println("\n");
		
		// a classic FIBONACCI series
		Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                  .limit(10).map(n -> n[0])
                  .forEach(x -> System.out.print(x+" "));
		System.out.println("\n");
		
		//Sum of terms in FIBONACCI series
		int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                  .limit(10).map(n -> n[0]).mapToInt(n -> n).sum();

        System.out.println("Fibonacci 10 sum : " + sum);
	}
}