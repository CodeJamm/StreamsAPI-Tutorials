package StreamExamples;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

public class SecureRandomstream 
{
	public static void main(String[] args) 
	{
		//To get the stream of secure random numbers (i.e. cryptographically strong random number), use subclass SecureRandom.
		SecureRandom random = new SecureRandom();
        
        //Five random integers
        random.ints( 5 ).sorted().forEach(e->System.out.print(e+" "));
        System.out.println();
 
        //Five random doubles between 0 (inclusive) and 0.5 (exclusive)
        random.doubles( 5, 0, 0.5 ).sorted().forEach(e->System.out.print(e+" "));
        System.out.println();
 
        //Boxing long to Long so they can be collected
        List<Long> longs = random.longs( 5 ).boxed().collect( Collectors.toList() );
        System.out.println(longs);
	}
}