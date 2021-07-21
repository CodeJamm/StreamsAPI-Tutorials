package StreamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import StudentClass.Student;

public class AnyMatchOperation 
{
	public static void main(String[] args) 
	{
		Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
		List<String> list = new ArrayList<>();
		stream.forEach(e->list.add(e.getName()));
		
		boolean result = list.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.print(result);
	}
}