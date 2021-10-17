package main.java.calculator;

import java.util.List;
import java.util.ArrayList;

public class StringCalculator {
	private final String delimeter = ",|\n";
	
    public int add(String input) throws RuntimeException{
    	String[] numbers = input.split(delimeter);
    	if(input.isEmpty())
    		return 0;
//    	if(input.length() == 1)
//    		return Integer.parseInt(input);
//    	else
//    		return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    	
		List<Integer> list = new ArrayList<>();
		for (String num : numbers) {
			if (Integer.parseInt(num) <= 0) {
				// throw new RuntimeException("Negatives Numbers not allowed");
				list.add(Integer.parseInt(num));
			}
		}
		if (list.size() > 0) {
			throw new RuntimeException("Negatives Numbers not allowed" + list.toString());
		}
    	
    	//Allow the Add method to handle an unknown amount of numbers
    	int sum = 0;
    	for(String num : numbers) {
    		sum = sum + Integer.parseInt(num);
    	}
    	return sum;
    }
    
    
    
    
}
