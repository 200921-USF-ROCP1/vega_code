package Calculator;

public class CalculatorImpl implements Calculator{


	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public int exponent(int x, int e) {
		int answer = 1;
		for(int i = 0; i < e; i++) {
			answer *= x;
		}
		
		return answer;
		//This next one works but let's do it manually instead
		//return (int) Math.pow(x, e);
	}

	@Override
	public int fibonacci(int i) {
		if(i <= 1) {
			return i;
		}
		
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

	@Override
	public int parse(String s) {
		String[] parts = s.split(" ");
		
		
		//Check for fibonacci and exponent first
		if(parts[0].equals("fib")) {
			int num1 = Integer.parseInt(parts[1]);
			return fibonacci(num1);
				
		} else if(parts[0].equals("exp")) {
			int num1 = Integer.parseInt(parts[1]);
			int num2 = Integer.parseInt(parts[2]);
			return exponent(num1, num2);
			
		}else if(parts[0] != "fib" && parts[0] != "exp") {
			int num1 = Integer.parseInt(parts[0]);
			String operator = parts[1];
			int num2 = Integer.parseInt(parts[2]);
			
			int answer = 0;
			switch(operator) {
				case "+": {
					return add(num1, num2);
				}
				case "-": {
					return subtract(num1, num2);
				}
				case "*": {
					return multiply(num1, num2);
				}
				case "/": {
					return divide(num1, num2);	
				}
				default: {
					return 0;
				}
			}
		}
		return 0;
	}
}
