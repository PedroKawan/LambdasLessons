package program;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
	
	public static void main(String[] args) {
		List<String> list = Arrays
				.asList("Pedro", "Ana", "João", "Emille");
		
		//Lambda
		list.forEach(a -> System.out.println(a));
		list.forEach(a -> imprimir(a));
		System.out.println();
		
		//Method reference
		list.forEach(System.out::println);
		list.forEach(ForEachMain::imprimir);
	}
	
	public static void imprimir(Object list) {
		System.out.println("-> " + list);
	}
}
