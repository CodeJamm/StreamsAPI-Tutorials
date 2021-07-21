package StudentClass;

import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class Student 
{
	private int ID;
	static int counter = 0;
	private String Name;
	private static final Random r = new Random(Integer.MAX_VALUE);  
	private static List<String> names = Arrays.asList("Ram","Ajay","Arjun","Ravi","Sanju");
	
	public Student(int ID,String Name)
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
	
	@Override
	public String toString()
	{
	    return "Student [id=" + ID + ", name=" + Name + "]";
	}
	
	public static Student create() 
	{
        Student obj = new Student(r.nextInt(),names.get(counter));
        counter++;
        return obj;
    }
}