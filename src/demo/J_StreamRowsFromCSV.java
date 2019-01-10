package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class J_StreamRowsFromCSV {

	public static void main(String[] args) throws IOException {
		//This Stream will Stream rows from a CSV text file to a List.
		//.map() will split all of the values by the comma.
		//.filter() will filter out all of the rows which do not have a length of at least 2.
		//.count() is the terminal operation which will reduce the data to a single item(int rowCount)
		//.forEach() will print each element in the list.
		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		int rowCount = (int)rows
				.map(x -> x.split(","))
				.filter(x -> x.length > 2)
				.count();
		System.out.println(rowCount + " rows.");
		rows.close();
		

	}

}
