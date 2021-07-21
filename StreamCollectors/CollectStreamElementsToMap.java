package StreamCollectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student
{
	private int ID;
	private String Name;
	Student(int ID,String Name)
	{
		this.ID=ID;
		this.Name=Name;
	}
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
}

public class CollectStreamElementsToMap 
{
	public static void main(String[] args) 
	{
		Stream<Student> stream = Stream.of(new Student(1,"Ram"),new Student(2,"Arjun"),new Student(3,"Kavi"),new Student(4,"Sanju"),new Student(5,"Ajay"));
		Map<Integer,String> map = stream.collect(Collectors.toMap(Student::getID,Student::getName));
		
		System.out.println("Original Value:");
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//sort map based on key
		Map<Integer,String> result1 = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result1.put(x.getKey(), x.getValue()));
		System.out.println("Sort By Key:" + result1);
		
		//sort map based on Value
		Map<Integer,String> result2 = new LinkedHashMap<>();
		map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
		System.out.println("Sort By Value:" + result2);
	}
}