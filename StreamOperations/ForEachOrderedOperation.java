package StreamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import StudentClass.Student;

public class ForEachOrderedOperation 
{
	public static void main(String[] args) 
	{
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
		List<String> list = new ArrayList<>();
		stream.forEach(e->list.add(e.getName()));
		
		list.stream().forEachOrdered( System.out::println );
		
		//for parallel streams -> it is true
		list.stream().parallel().forEachOrdered( System.out::println );
		
		//for sequential streams -> it is true
		list.stream().sequential().forEachOrdered( System.out::println );
		
		//forEachOrdered() operation respects the the encounter order of the Stream if the stream has a defined encounter order. 
		//This behavior is true for parallel streams as well as sequential streams.
	}
}