package com.javaguides.java.tutorial;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamMinMax {

	public static void main(String[] args) {
		// count(), min(), & max()
		Supplier<Stream<Integer>> streamSupplier 
		  = () -> Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println(streamSupplier.get().count());
		
		Integer min = streamSupplier.get().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min=" + min);
		
		Integer max = streamSupplier.get().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max=" + max);

	}

}
