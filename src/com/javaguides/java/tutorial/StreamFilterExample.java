package com.javaguides.java.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {

		List<Product> list = Product.getProducts().stream().filter(o -> o.getPrice() > 25000f).collect(Collectors.toList());
		list.stream().forEach(System.out::println);

	}

}

