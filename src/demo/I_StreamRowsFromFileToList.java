package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class I_StreamRowsFromFileToList {

	public static void main(String[] args) throws IOException {
		//This Stream will Stream rows from a text file to a List.
		//.filter() will filter out all countries that contain a lowercase or uppercase letter a.
		//.collect() will accumulate the strings into a list
		//.forEach() will print each element in the list.
		
		List<String> countries = Files.lines(Paths.get("countries.txt"))
					.filter(x -> x.contains("a") || x.contains("A"))
					.collect(Collectors.toList());
		countries.forEach(x -> System.out.println(x));
	}

}
