package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {
	
	public static void main(String args[]) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		numbers.stream()
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
		System.out.println(squaredNumbers);
		
		List<Integer> evenNumbers = numbers.stream()
				.filter(number -> number%2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		int sum = numbers.stream()
				.reduce(0, (x,y) -> x + y);
		System.out.println(sum);
		
		int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x:y);
		System.out.println(greatest);
		
		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF" );
		
		List<String> coursesSortedByLenght = courses.stream()
				.sorted(Comparator.comparing(str -> ((String)str).length()))
				.collect(Collectors.toList());
		System.out.println(coursesSortedByLenght);
	}
	
}
