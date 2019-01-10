package demo;

import java.util.Arrays;
import java.util.List;

public class G_StreamList_Filter_Print {
	
	public static void main(String[] args) {
		
		//This Stream will stream the elements of the cities List.
		//.map() will map all of the elements to a lowercase version of itself.
		//.filter() will filter all of the elements that start with "b".
		//the second map() lambda creates a substring of the first letter and the rest of the word for each element.
		//the first letter (substring 0) gets converted toUpperCase.
		//forEach will print the elements.
		
		// *Note*: Stream.of(cities) will not give us a stream with the elements of the collection,
		//instead it will give us a stream of the collection, not the elements.
		//If we need a stream containing the elements of the collection, we must use cities.stream()
		
		List<String> cities = Arrays.asList("deTrOIT", "bERlIN", "MONTREAL", "Barcelona", "liSBon", "BOSTOn", "bRIGHTON");
		
		cities.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("b"))
			.map(x -> x.substring(0,1).toUpperCase() + x.substring(1))
			.sorted()
			.forEach(x -> System.out.println(x));
	}
}
