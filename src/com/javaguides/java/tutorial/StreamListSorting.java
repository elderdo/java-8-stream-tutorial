package com.javaguides.java.tutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	public static void main(String[] args) {
		List <String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		// ascending order
		System.out.println("***** ascescending:");
		System.out.println("1.");
		fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("2.");
		fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("3.");
		fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("***** descending:"); 
		// descending order
		System.out.println("1.");
		fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("2.");
		fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("***** employees sorted by salary ascending:"); 
		List<Employee> employees = Employee.getEmployees();
		List<Employee> sortedBySalary = employees.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		
		sortedBySalary.forEach(System.out::println);
		
		System.out.println("***** employees sorted by salary ascending via lambda:"); 
		
		List<Employee> sortedBySalaryLambda = employees.stream().sorted(
				(o1,o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		
		sortedBySalaryLambda.forEach(System.out::println);
		
		List<Employee> sortedBySalaryLambdaDesc = employees.stream().sorted(
				(o1,o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		System.out.println("***** employees sorted by salary descending via lambda:");
		sortedBySalaryLambdaDesc.forEach(System.out::println);
		List<Employee> sortedBySalaryComparator = employees.stream().sorted(
				Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println("***** employees sorted by salary ascending via co"
				+ "mparator:");
		sortedBySalaryComparator.forEach(System.out::println);
		List<Employee> sortedBySalaryComparatorRev = employees.stream().sorted(
				Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("***** employees sorted by salary descending via co"
				+ "mparator:");
		sortedBySalaryComparatorRev.forEach(System.out::println);

		List<Employee> sortedByAgeComparator = employees.stream().sorted(
				Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		System.out.println("***** employees sorted by age ascending via co"
				+ "mparator:");
		sortedByAgeComparator.forEach(System.out::println);
		List<Employee> sortedByAgeComparatorRev = employees.stream().sorted(
				Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
		System.out.println("***** employees sorted by age descending via co"
				+ "mparator:");
		sortedByAgeComparatorRev.forEach(System.out::println);

		List<Employee> sortedByNameComparator = employees.stream().sorted(
				Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println("***** employees sorted by name ascending via co"
				+ "mparator:");
		sortedByNameComparator.forEach(System.out::println);
		List<Employee> sortedByNameComparatorRev = employees.stream().sorted(
				Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		System.out.println("***** employees sorted by name descending via co"
				+ "mparator:");
		sortedByNameComparatorRev.forEach(System.out::println);

	}
}
