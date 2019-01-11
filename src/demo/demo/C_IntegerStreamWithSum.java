package demo;

import java.util.stream.IntStream;

public class C_IntegerStreamWithSum {

	public static void main(String[] args) {
		
		// This Stream will sum the range from 1 to 4.  The Stream is encapsulated in a
		// System.out.println, which will print the terminal operation once it's complete.
		System.out.println(
		IntStream
			.range(1,5)
			.sum());
	}
}
