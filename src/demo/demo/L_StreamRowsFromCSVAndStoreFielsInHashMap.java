package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L_StreamRowsFromCSVAndStoreFielsInHashMap {

	public static void main(String[] args) throws IOException {
		
		//This Stream will Stream rows from a CSV text file to a List.
		//.map() will split all of the values by the comma.
		//.filter() will filter out all of the rows which do not have a length of at least 2.
		//.filter() will filter rows that have a value greater than 15 in their 1st row.
		//.collect(Collectors.toMap) will parse the int value from the row array
		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		
		map = rows
			.map(x -> x.split(","))
			.filter(x -> x.length > 2)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
					x -> x[0], 
					x -> Integer.parseInt(x[1])));
		rows.close();
		
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
