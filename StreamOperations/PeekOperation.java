package StreamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import StudentClass.Student;

public class PeekOperation 
{
	public static void main(String[] args) 
	{ 
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
		List<String> list = new ArrayList<>();
		stream.forEach(e->list.add(e.getName()));
		
		//peek() returns a new Stream consist of elements from the original Stream
		
		//using peek() without terminal operation -> prints nothing
		//list.stream().peek(System.out::println); 
		
		//using peek() with terminal operation
		List<String> newList = list.stream()
	            .peek(System.out::println).collect(Collectors.toList());
	    System.out.println(newList);
	    
	    //Stream.peek() method can be useful in visualizing how the stream operations behave and understanding the implications and interactions of complex intermediate stream operations
	}
}