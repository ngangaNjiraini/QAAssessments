package HelloPackage;

public class HelloWorld {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(1,2));
		System.out.println(calc.multiply(4, 3));
		System.out.println(calc.subtract(34,8));
		System.out.println(calc.divide(5, 10));
		
		
	}

	private String helloWorld() {
		String hello = ("Hello World");
		return hello;
	}
	
}
