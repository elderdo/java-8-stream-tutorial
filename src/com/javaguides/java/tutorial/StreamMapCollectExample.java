package com.javaguides.java.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Ramesh", "secretx", "ramesh@gmail.com"));
		users.add(new User(2, "Tony", "secrety", "tony@gmail.com"));
		users.add(new User(3, "Tom", "secretz", "tom@gmail.com"));
		users.add(new User(4, "Bill", "secreta", "bill@gmail.com"));

		List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		//
		for (User user : users) {
			usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}
		
		System.out.println("****** using for loop ");
		for (UserDTO dto : usersDTO) {
			System.out.println(dto);
		}
		// using stream map
		System.out.println("****** using map and annonymous function ");
		users.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
			}
		}).forEach(System.out::println);
		
		System.out.println("****** using map and lambda ");
		// using stream map with lambda
		users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
				.forEach((userdto) -> System.out.println(userdto));
		
		System.out.println("****** using map, lambda, and collect for new list ");
		// using stream map with lambda
		List<UserDTO> usersDTO2 = users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
				.collect(Collectors.toList());
		usersDTO2.forEach(System.out::println);


	}

}
