package program;

public class CalculationMain {

	//Paradigm functional.
	public static void main(String[] args) {

		//Defining behavior of interface.
		//In functions:
		Calc soma = (x, y) -> {System.out.println(x + y);};
		soma.calculation(2, 8);
		
		Calc multiply = (x,y) -> {System.out.println(x * y);};
		multiply.calculation(2, 8);
		
		
		System.out.println();
		
		
		//In methods:
		Soma s = new Soma();
		s.calculation(2, 3);
		
		//switching behaviors;
		Soma m = new Soma() {
			@Override
			public void calculation(int x, int y) {
				System.out.println(x * y);
			}
		};
		m.calculation(2, 3);
		
	}

}
