package StreamOperations;

import java.util.stream.Stream;
import StudentClass.Student;

public class LimitOperation 
{
	public static void main(String[] args)
	{
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
        //limits to only first n values from the stream
		stream.limit(3).forEach(e->System.out.print(e.getName()+" "));
		
		//Note: limit() works only on streams and not on any other collections
	}
}