package demo;

import java.util.stream.IntStream;

public class B_IntegerStreamWithSkip {

	// This Stream is going to skip every number in the range (1,10), until it reaches a 5.
	// After it reaches 5, only then will it begin to perform it's terminal operation:
	// Printing 6, 7, 8 and 9.
	public static void main(String[] args) {
		
		IntStream
			.range(1, 10) // Stream Source
			.skip(5)
			.forEach(x -> System.out.print(x+"-"));
	}
}
