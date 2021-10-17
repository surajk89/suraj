package main.java.calculator;

public class StringCalculator {
	private final String delimeter = ",|\n";
	
    public int add(String input) {
    	String[] numbers = input.split(",");
    	if(input.isEmpty())
    		return 0;
//    	if(input.length() == 1)
//    		return Integer.parseInt(input);
//    	else
//    		return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    	
    	//Allow the Add method to handle an unknown amount of numbers
    	int sum = 0;
    	for(String num : numbers) {
    		sum = sum + Integer.parseInt(num);
    	}
    	return sum;
    }
    
    
    
    
}
