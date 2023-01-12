package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterface {
	public static void main(String args[]) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
//		squaredEvenNumbers(numbers);
		
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer a, Integer b) {
				return a+b;
			}
		};
		int sum = numbers.stream().reduce(0, sumBinaryOperator2);
		System.out.println(sum);
		
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
		
		System.out.println(unaryOperator.apply(2));
		
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number<10 && str.length()>5;
		};
		System.out.println(biPredicate.test(5, "in28minutes"));
		
		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + " " + str;
		};
		System.out.println(biFunction.apply(5, "in28minutes"));
		
		BiConsumer<String, String> biConsumer = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		biConsumer.accept("Federico", "Mengoni");
		
		IntBinaryOperator sumBinaryOperator4 = (x,y) -> x+y;
		System.out.println(sumBinaryOperator4. applyAsInt(3, 4));
 	}

	private static void squaredEvenNumbers(List<Integer> numbers) {
		Predicate<Integer> evenPredicate = x -> x%2 == 0;
		Predicate<Integer> evenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x%2==0;
			}
		};
		
		Function<Integer, Integer> squaredFunction = x -> x * x;
		Function<Integer, Integer> squaredFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		};
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
		numbers.stream()
			.filter(evenPredicate2)
			.map(squaredFunction2)
			.forEach(sysoutConsumer2);
	}
}
