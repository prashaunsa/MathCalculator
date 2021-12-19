package pjn.math.model;

import pjn.math.exception.InvalidOperationInputException;
import pjn.math.interfaces.Operation;

public class Subtraction implements Operation {

	public Float calculate(Float... operands) throws InvalidOperationInputException {
		
		if(operands.length > 1) {
			
			Float result = operands[0];
			
			for(int i = 1; i < operands.length; i++)
				result -= operands[i];
			
			return result;
		}
		else
			throw new InvalidOperationInputException("Minimum 2 operands required");
	
	}

}
