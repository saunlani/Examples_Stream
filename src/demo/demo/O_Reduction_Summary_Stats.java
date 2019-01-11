package demo;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class O_Reduction_Summary_Stats {
	
	//This Stream will provide a state object (IntSummaryStatistics)
	//for collecting statistics such as count, min, max, sum, and average.
	
	public static void main(String[] args) {
		IntSummaryStatistics summary = IntStream.of(7,1,6,20,40,70)
				.summaryStatistics();
		System.out.println(summary);
	}

}
