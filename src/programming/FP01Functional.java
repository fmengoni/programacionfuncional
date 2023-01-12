package programming;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("HH:mm:ss:SS");
		System.out.println(df.format(new Date()));
		
//		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		
//		List<String> courses = List.of("Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4");
		List<String> courses = Arrays.asList("Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4","Course Spring 1","Course Spring 2","AWS","Course GCP 4");
		
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
		
//		printOddNumbersInListFunctional(numbers);
//		printCubesOddNumbersInListFunctional(numbers);
//		printAllCourses(courses);
//		printCoursesContainText(courses);
//		printCoursesAtleastFourLetters(courses);
		printCharactersInListFunctional(courses);
		
//		printSquareEvenNumbersInListFunctional(numbers);
		System.out.println("");
		System.out.println(df.format(new Date()));
	}

	private static void printCharactersInListFunctional(List<String> courses) {
		courses.stream()
		.map(course -> course.length())
		.forEach(System.out::print);
	}

	private static void printCoursesAtleastFourLetters(List<String> courses) {
		courses.stream()
		.filter(course -> course.length() > 3)
		.forEach(System.out::println);
	}

	private static void printCoursesContainText(List<String> courses) {
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::print);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 == 1)
		.forEach(System.out::println);
	}
	
	private static void printCubesOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 == 1)
		.map(number -> number * number * number)
		.forEach(System.out::println);
	}

	private static void printSquareEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 == 0)
		.map(number -> number * number)
		.forEach(System.out::println);
	}
	
	private static void printAllCourses(List<String> courses) {
		courses.stream()
		.forEach(System.out::println);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			//.filter(FP01Functional::isEven)
			.filter(number -> number%2 == 0) //Lambda Expression
			.forEach(System.out::println);
	}

}
