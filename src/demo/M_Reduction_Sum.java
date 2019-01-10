package demo;

import java.util.stream.Stream;

public class M_Reduction_Sum {

	//This Stream will reduce(or fold) to a sum.
	//Stream.of will provide our stream.
	//.reduce is given a starting total of 0.0, and will continue to add all of the element values
	// each time it passes.
	
	public static void main(String[] args) {
		double total = Stream.of(1.4, 0.2, 5.1)
				.reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);

	}

}
