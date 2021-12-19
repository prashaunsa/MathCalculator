package pjn.math.model;

import pjn.math.exception.InvalidOperationInputException;
import pjn.math.interfaces.Operation;

public class Multiplication implements Operation {

	public Float calculate(Float... operands) throws InvalidOperationInputException {
		
		if(operands.length > 1) {
			
			if(operands[0] == 0)
				return 0f;
			
			Float result = operands[0];
			
			for(int i = 1; i < operands.length; i++) {
				if(operands[i] == 0)
					return 0f;
				result *= operands[i];
			}
			return result;
		}
		else
			throw new InvalidOperationInputException("Minimum 2 operands required");
	}

}
