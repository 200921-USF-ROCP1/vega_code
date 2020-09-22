package Calculator;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Welcomet to the Calculator");
		System.out.println("Enter your command below:");
		
		CalculatorImpl c = new CalculatorImpl();
		Scanner scanner = new Scanner(System.in);
		String input = " ";
		
		while(true) {
			input = scanner.nextLine();
			
			//If input is 0 then stop.
			if(input.equals("0")) {
				break;
			}
			
			calculate(input);
		}
		scanner.close();
	}
	
	public static void calculate(String input) {
		CalculatorImpl c = new CalculatorImpl();
		
		try {
		System.out.println(c.parse(input));
		} catch(Exception e) {
			System.out.println("Wrong input type");
		} 
	}

}
