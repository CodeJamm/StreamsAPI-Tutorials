package StreamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import StudentClass.Student;

public class MaxOperation 
{
	public static void main(String[] args) 
	{
		//largest element in the stream with lambda expression
		List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Optional<Integer> maxNumber1 = list1.stream().max((i, j) -> i.compareTo(j));
        System.out.println(maxNumber1.get());
        
        
		//largest element in the stream with Comparator
        List<Integer> list2 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Comparator<Integer> maxComparator = new Comparator<Integer>() 
        {   
            @Override
            public int compare(Integer n1, Integer n2) {
                return n1.compareTo(n2);
            }
        };
        Optional<Integer> maxNumber2 = list2.stream().max(maxComparator);
        System.out.println(maxNumber2.get());
        
        
        //largest string of Student class stream
        Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		List<String> list = new ArrayList<>();
		stream.forEach(e->list.add(e.getName()));
		Comparator<String> comparator = new Comparator<String>() 
        {   
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        Optional<String> maxString = list.stream().max(comparator);
        System.out.println(maxString.get());
	}
}