package StreamOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;


public class FlatMapOperation 
{
	public static void main(String[] args) 
    {
		
		//Converting nested lists into List using flatMap()
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
          
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
         
        List<Integer> listOfAllIntegers = listOfLists.stream()
                            .flatMap(x -> x.stream())
                            .collect(Collectors.toList());
        System.out.println(listOfAllIntegers);
        
        
        
        //Converting nested Arrays into list using flatMap()
        String[][] arr = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        
        List<String> listOfAllChars = Arrays.stream(arr)
                                    .flatMap(x -> Arrays.stream(x))
                                    .collect(Collectors.toList());
        System.out.println(listOfAllChars);
    }
}