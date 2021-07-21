package StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import StudentClass.Student;

public class DistinctByKeys
{
	public static void main(String[] args)
	{
		 Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"))
                .filter(distinctByKeys(Student::getID, Student::getName))
                .collect(Collectors.toList()).forEach(System.out::println);
         System.out.println();
	}
	
	private static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors) 
	{
	    final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();
	    return t -> 
	    {
	      final List<?> keys = Arrays.stream(keyExtractors)
	                  .map(ke -> ke.apply(t))
	                  .collect(Collectors.toList());
	      return seen.putIfAbsent(keys, Boolean.TRUE) == null;
	    };
	}
}