package calculator.operator;

import calculator.IElement;

/**
 * This interface will provide comparable capabilities and also provide support for any operator if you want to implement.
 * @author Vidyasagar
 *
 */
public interface IOperator extends IElement {

  public char getOperator();

  public int getOrderOfPrecedence();

  public double eval(double operand1, double operand2);

  public int compareTo(IOperator opThis);

}
