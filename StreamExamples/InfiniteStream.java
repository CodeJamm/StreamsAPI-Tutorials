package StreamExamples;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import StudentClass.Student;

public class InfiniteStream 
{
	public static void main(String[] args) 
	{
		
		//Infinite stream of random numbers
		List<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100))
                .limit(10).collect(Collectors.toList());
        System.out.println(randomNumbers);
        
        //infinite stream of Custom Objects
        List<Student> students = Stream.generate(Student::create)
                .limit(5).collect(Collectors.toList());
        for(Student student:students)
        {
        	System.out.println("Student ID : "+student.getID()+" , Student Name : "+student.getName());
        }
	}
}