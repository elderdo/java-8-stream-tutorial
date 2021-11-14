package com.javaguides.java.tutorial;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author delder
 * @see <a href="https://www.youtube.com/watch?v=8yyHwQtnOj4&t=249s">Tutoria</a>
 */
public class CreateStreamObjects {
	public static void main(String[] args) {
		// create stream
		Stream<String> stream = Stream.of("a","b","c");
		stream.forEach(System.out::println); // pass method reference to each item in the stream
		"Hello World".codePoints().mapToObj(c -> (char) c).forEach(System.out::println);
		"Hello Brave New World".codePoints().mapToObj(c -> String.valueOf((char) c)).forEach(System.out::println);

		// create stream from collection
		Collection<String> collection = Arrays.asList("Java","J2EE", "Spring", "Hiberhate");
		collection.stream().forEach(System.out::println);

		List<String> list = Arrays.asList("Java","J2EE", "Spring", "Hiberhate");
		list.stream().sorted().forEach(System.out::println);
		
		String[] strArr = {"This is 1", "This is 2", "This is 3"};
		Arrays.stream(strArr).forEach(System.out::println);

	}
}
