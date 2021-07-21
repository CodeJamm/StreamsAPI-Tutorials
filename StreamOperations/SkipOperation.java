package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import StudentClass.Student;

public class SkipOperation
{
	public static void main(String[] args) 
	{
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		
        //skip() is used to skip n elements and print the remaining
        stream.skip(2).forEach(e->System.out.print(e.getName()+" "));
        
        //we can also skip elements and limit in the remaining to print
        
        //it skips 2 elements and print the next 1 element only
        List<Student> newList = stream.skip(2).limit(1).collect(Collectors.toList());
        for(Student student:newList)
        {
        	System.out.print(student.getName()+" ");
        }
	}
}