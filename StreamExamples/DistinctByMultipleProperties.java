package StreamExamples;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import StudentClass.CustomKey;
import StudentClass.Student;

public class DistinctByMultipleProperties
{
	public static void main(String[] args) 
	{
        Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"))
	              .filter(distinctByKey(CustomKey::new))
	              .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println();
        
	 }
	 public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
	 {
	     Map<Object, Boolean> seen = new ConcurrentHashMap<>();
	     return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	 }
}