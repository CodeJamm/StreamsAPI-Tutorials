package StreamExamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import StudentClass.Student;

public class SortingOnMultipleFields
{
	public static void main(String[] args) 
	{
		
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		List<Student> list = new ArrayList<>();
		stream.forEach(e->list.add(e));
		
		//sorting by name and then sorting by ID
		Comparator<Student> compareByName = Comparator
                .comparing(Student::getName).thenComparing(Student::getID);

        List<Student> sortedStudents = list.stream()
                .sorted(compareByName).collect(Collectors.toList());
        System.out.println(sortedStudents);
	}
}