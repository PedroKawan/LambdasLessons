package topfunctions;

import classes.Test;

public class TestMain {
	public static void main(String[] args) {
		Test<String,Boolean> test = (x,y) -> {
			Boolean a = Boolean.parseBoolean(x);
			return a && y;
		}; 
		
		String p = Boolean.toString(true);
		boolean result = test.itest(p, true);
		
		System.out.println(result);
	}
}
