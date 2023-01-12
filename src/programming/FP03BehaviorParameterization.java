package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
//		filterAndPrint(numbers, x -> x%2==0);
//		filterAndPrint(numbers, x -> x%2!=0);
		
		List transformListOfNumbers = transformeAndGenerateList(numbers, x -> x * x);
		System.out.println(transformListOfNumbers);
	}


	private static List<? extends Integer> transformeAndGenerateList(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> square) {
		return numbers.stream().map(square).collect(Collectors.toList());
	}
	

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> oddPredicate) {
		numbers.stream()
		.filter(oddPredicate)
		.forEach(System.out::println);
	}

}
