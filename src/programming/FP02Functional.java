package programming;

import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<Integer> doubledNumbers = doubleList(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot","API","Microservices","AWS", "PCP", "Azure", "Docker", "Kubernetes");
	
		System.out.println(doubledNumbers);
		
		System.out.println(evenNumbersOnly(numbers));
		
		System.out.println(lenghtOfCourseTitle(courses));
//		int sum = addListFunctional(numbers);
//		System.out.println(sum);
		
//		courses.stream().sorted().forEach(System.out::println);
//		System.out.println("-----");
//		courses.stream().distinct().sorted().forEach(System.out::println);
//		System.out.println("-----");
//		courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		System.out.println("-----");
//		courses.stream().distinct().sorted(Comparator.comparing(str -> ((String)str).length())).forEach(System.out::println);
		
		
	}
	
	private static List<Integer> lenghtOfCourseTitle(List<String> courses) {
		return courses.stream()
				.map(course -> course.length())
				.collect(Collectors.toList());
	}

	private static List<Integer> evenNumbersOnly(List<Integer> numbers) {
		return numbers.stream()
				.filter(number -> number % 2 == 0)
				.collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream()
//			.reduce(0, FP02Functional::sum);
//			.reduce(0, (x,y) -> x + y);
			.reduce(0, Integer::sum);
				
	}
}
