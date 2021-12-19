package pjn.math.model;

import pjn.math.exception.InvalidOperationInputException;
import pjn.math.interfaces.Operation;

public class Addition implements Operation {

	public Float calculate(Float ... operands) throws InvalidOperationInputException {
		
		if(operands.length > 1) {
			
			Float sum = 0f;
			
			for(Float i : operands)
				sum += i;
			
			return sum;
		}
		else
			throw new InvalidOperationInputException("Minimum 2 operands required");
	}

}
