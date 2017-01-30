package calculator.operator;

import java.util.Collection;

/**
 * This interface will provide validations information on operators.
 * @author 4servadmin
 *
 */
public interface IOperatorFactory {

  public boolean isValid(char operator);

  public Collection<IOperator> getOperators();

  public IOperator getOperator(char operator);

}
