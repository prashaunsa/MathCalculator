package pjn.math.interfaces;

import pjn.math.exception.InvalidOperationInputException;

public interface Operation {

	public Float calculate(Float ... operands) throws InvalidOperationInputException;
}
