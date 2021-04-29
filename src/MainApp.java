
public class MainApp {
	
	public static void main(String[] args) {
		
		System.out.println("The number1 is 5");
		System.out.println("The number2 is 5");
		
		Operation addition = new Operation();
		addition.sum();
		
		Operation multiply = new Operation();
		multiply.multiplication();
		
		Operation minus = new Operation();
		minus.difference();
	}
}
