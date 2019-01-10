package demo;

import java.util.stream.Stream;

public class D_StreamOf_Sorted_FindFirst {

	public static void main(String[] args) {
		// This Stream uses the Stream.of function
		// Stream.of can stream integers, strings, floats and objects.
		// We're streaming the three strings below, sorted() will sort them alphabetically.
		// findFirst() will then find the first element of the stream.
		// ifPresent will print the first element, if it exists.(great for reducing potential exception errors)
		Stream.of("Ciao", "Aloha", "Guten Tag")
			.sorted()
			.findFirst()
			.ifPresent(x-> System.out.print(x));
	}
}
