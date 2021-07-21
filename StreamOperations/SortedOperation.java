package StreamOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import StudentClass.Student;

public class SortedOperation 
{
	public static void main(String[] args) 
	{
		Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
		List<String> list = new ArrayList<>();
		stream.forEach(e->list.add(e.getName()));
		
		//sorted in ascending order
		list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		//sorted in reverse order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}