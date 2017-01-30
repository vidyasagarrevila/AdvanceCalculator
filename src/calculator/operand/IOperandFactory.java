package calculator.operand;

import java.util.Collection;

/**
 * This interface will provide validations information on operands.
 * @author Vidyasagar
 *
 */
public interface IOperandFactory {

  public boolean isValid(char operand);

  public Collection<Character> getOperands();

  public IOperand build(String operand);
}
