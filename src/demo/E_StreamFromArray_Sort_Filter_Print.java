package demo;

import java.util.stream.Stream;

public class E_StreamFromArray_Sort_Filter_Print {

	public static void main(String[] args) {
		
		//This Stream streams an array of Strings.
		//The Stream is first filtered by whether or not each array element starts with an "S".
		//The Stream is then sorted alphabetically with sort().
		//The forEach() loop iterates through the filtered and sorted Stream,
		//using a lamba to print each element.
		
		String[] fish = {"Snapper", "Shrimp", "Salmon", "Tuna","Eel", "Yellow Tail",}; 
		
		Stream.of(fish)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(x -> System.out.print(x +","));
	}
}
