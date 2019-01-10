package demo;

import java.util.Arrays;

public class F_Average {

	public static void main(String[] args) {
		//This Stream streams an int array to map().
		//map() will map each integer to the initial value's square.(x*x creates square of it's original value)
		//average() will average all of the elements in the stream into an Optional Double.
		//ifPreset() will print the average (Option Double) value, if it is present.
		
		// *Note*: Using Stream.of() method returns Stream whereas Arrays.stream() returns an IntStream. 
		// Notice that we used Arrays.stream() for this case because we are performing mathematical operations
		// on the Integers in the Stream.  This requires us to use an IntStream, not a Stream.
		
		
		int[] numbers = { 1, 2, 3, 4, 5};
		Arrays.stream(numbers)
			.map(x -> x * x)
			.average()
			.ifPresent(x -> System.out.println(x));
	}
}
