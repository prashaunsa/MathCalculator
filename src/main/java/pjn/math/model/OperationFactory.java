package pjn.math.model;

import pjn.math.interfaces.Operation;
import pjn.math.util.Constants;

public class OperationFactory {

	public Operation getOperation(String operation) {
		
		switch(operation) {
			
			case Constants.OPERATION_ADD:
				return new Addition();
			
			case Constants.OPERATION_SUBTRACT:
				return new Subtraction();
			
			case Constants.OPERATION_MULTIPLY:
				return new Multiplication();
			
			case Constants.OPERATION_DIVIDE:
				return new Division();
			
			default : return null;
		}
		
	}
}
