package calculator.operand;

import calculator.IElement;

/**
 * This interface will provide validation on operands.
 * @author Vidyasagar
 *
 */
public interface IOperand extends IElement {

  public String getValueAsStr();

  public double getValue();

}
