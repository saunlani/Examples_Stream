package demo;

import java.util.stream.*;

public class A_IntegerStream {

	public static void main(String[] args) {
		
		//This Stream will print every integer from 1 to 9.
		IntStream
			.range(1, 10) // Stream Source
			.forEach(x -> System.out.print(x + "-")); // Terminal Operation
	}
}
