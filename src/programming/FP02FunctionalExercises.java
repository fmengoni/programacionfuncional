package programming;

import java.util.List;

public class FP02FunctionalExercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
	
		System.out.println("La suma de todos los números al cuadrado es: " + squareNumbersInListFunctional(numbers));
		System.out.println("Suma de numeros al cubo: " + squareAndSumNumbersInListFunctional(numbers));
		
		System.out.println("Suma de numeros pares:" + sumOddNumbersInListFunctional(numbers));
	}
	
	private static int sumOddNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream()
			.filter(number -> number % 2 == 1)
			.reduce(0, Integer::sum);
	}

	private static int squareNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream()
				.map(x -> x * x)
				.reduce(0, Integer::sum);
	}

	private static int squareAndSumNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream()
				.map(x -> x*x*x)
				.reduce(0, Integer::sum);
	}

}
