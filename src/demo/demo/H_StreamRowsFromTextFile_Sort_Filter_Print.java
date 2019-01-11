package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class H_StreamRowsFromTextFile_Sort_Filter_Print {

	public static void main(String[] args) throws IOException {
		
		// This Stream will stream rows from a text file, convert all to lowercase,
		// uppercase the first letter of the country name, filter by country names with a length
		// less than 7, sort alphabetically, then print each to a new console line.
		// We must use .close() in order to prevent memory leaks.
		
		Stream<String> countries = Files.lines(Paths.get("countries.txt"));
		
		countries
			.map(x-> x.toLowerCase())
			.map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
			.filter(x -> x.length() < 7)
			.sorted()
			.forEach(x -> System.out.println(x));
		countries.close();
	}
}
