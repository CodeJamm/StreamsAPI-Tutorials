package StreamExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfLines 
{
	public static void main(String[] args) 
	{
		
		//Read file line by line
		Path filePath1 = Paths.get("C:\\temp", "data.txt");
		try(Stream<String> lines = Files.lines(filePath1)) 
		{
		    lines.forEach(System.out::println);
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		System.out.println();
		
		
		//Filtering Stream of Lines
		Path filePath2 = Paths.get("c:/temp", "data.txt");
		try 
		{
			Files.lines(filePath2).filter(s -> s.contains("How are you"))
		                    .collect(Collectors.toList()).forEach(System.out::println);
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		System.out.println();
		
		
		//Reading file using FileReader
		try
		{
		    File file = new File("c:/temp/data.txt");
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        String line;
	        while((line = br.readLine()) != null)
	        {
	            if(line.contains("How are you"))
	            {
	                System.out.println(line);
	            }
	        }
	        br.close();
	        fr.close();
		}
		catch(Exception e){System.out.print(e);}
	    
	}
}