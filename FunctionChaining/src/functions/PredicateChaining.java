package functions;

import java.util.function.Predicate;

public class PredicateChaining {
	public static void main(String[] args) {
		Predicate<Integer> isPar = x -> x % 2 == 0; 
		Predicate<Integer> isGreater = x -> x > 10; 
		
		//if is odd and pair.
		Boolean and = isPar.and(isGreater).test(12); 
		println("And: " + and);
		
		println(isPar.and(isGreater).test(13));
		
		println(isPar.and(isGreater).test(8));

		l();
		
		//if is odd or pair.
		Boolean or = isPar.or(isGreater).test(12);
		println("Or: " + or);
		
		println(isPar.or(isGreater).test(13));
		
		println(isPar.or(isGreater).test(7));
		
		l();
		
		//if not is odd and pair.
		Boolean not = isPar.and(isGreater).negate().test(12);
		println("Not: " + not);
		
		println(isPar.and(isGreater).negate().test(13));
	
		println(isPar.and(isGreater).negate().test(8));
	}
	
	
	
	private static void println(Object o) {
		System.out.println(o);
	}
	private static void l() {
		System.out.println();
	}
}
