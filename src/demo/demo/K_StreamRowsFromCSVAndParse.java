package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class K_StreamRowsFromCSVAndParse {

	public static void main(String[] args) throws IOException {
		
		//This Stream will Stream rows from a CSV text file to a List.
		//.map() will split all of the values by the comma.
		//.filter() will filter out all of the rows which do not have a length of at least 2.
		//.filter() will filter rows that have a value greater than 15 in their 1st row.
		//.forEach() will print each item.
		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		rows
			.map(x -> x.split(","))
			.filter(x -> x.length > 2)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows.close();
	}
}
