package pjn.math.model;

import pjn.math.exception.InvalidOperationInputException;
import pjn.math.interfaces.Operation;

public class Division implements Operation {

	public Float calculate(Float... operands) throws InvalidOperationInputException {
		
		if(operands.length > 1) {
			
			Float result = operands[0];
			
			for(int i = 1; i < operands.length; i++) {
				if(operands[i] == 0)
					throw new InvalidOperationInputException("Cannot divide by zero");
				result /= operands[i];
				if(result == 0f)
					return 0f;
			}
			return result;
		}
		else
			throw new InvalidOperationInputException("Minimum 2 operands required");
	}
		
}

