package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbersLs) {
		for(int number:numbersLs) {
			System.out.println(number);
		}
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbersLs) {
		for(int number:numbersLs) {
			if(number%2==0)
			System.out.println(number);
		}
	}

}
