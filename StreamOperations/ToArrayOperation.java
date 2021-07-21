package StreamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import StudentClass.Student;

public class ToArrayOperation 
{
	public static void main(String[] args)
	{
		//Converting stream of strings to array of strings
		Stream<String> stream1 = Arrays.asList("A", "B", "C", "D").stream();
		String[] arr = stream1.toArray(String[]::new);
		System.out.println(Arrays.toString(arr)); 
		
		//Converting an Infinite Stream to an Array
		IntStream infiniteStream = IntStream.iterate(1, i -> i+1);
		int[] arr1 = infiniteStream.limit(10).toArray();
		System.out.println(Arrays.toString(arr1));  
		
		//To convert a stream of primitives, we must first box the elements in their wrapper classes and then collect the wrapped objects in a collection. 
		//This type of stream is called boxed stream.
		
		//Converting an Infinite Boxed Stream to an Array
		IntStream infiniteNumberStream = IntStream.iterate(1, i -> i+1);
		Integer[] arr2 = infiniteNumberStream.limit(10)
		                    .boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr2));
		
		//Stream filter and collect to an Array
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		List<Student> list = new ArrayList<>();
		stream.forEach(e->list.add(e));
		Student[] employeesArray = list.stream()
                .filter(e -> e.getName().startsWith("A"))
                .toArray(Student[]::new);
        for(Student student:employeesArray)
        {
        	System.out.print(student.getName()+" ");
        }
	}
}