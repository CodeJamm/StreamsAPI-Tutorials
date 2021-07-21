package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOperation 
{
    public static void main(String[] args)
    {
    	//distinct operation removes the duplicates
    	List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
    	List<String> distinctElements = list.stream()
    	                        .distinct().collect(Collectors.toList());
    	System.out.println(distinctElements);
    }
}