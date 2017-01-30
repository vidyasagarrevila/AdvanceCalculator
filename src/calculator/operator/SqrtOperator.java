package calculator.operator;

/**
 * This class will provide square root functionality and also adding comparable capabilities for the provided objects.
 * @author Vidyasagar
 *
 */
public class SqrtOperator implements IOperator, Comparable<IOperator> {

  private final char operator = '√';
  private final int orderOfPrecedence = 1;

  private static SqrtOperator instance = new SqrtOperator();

  private SqrtOperator() {}

  public char getOperator() {
    return operator;
  }

  public int getOrderOfPrecedence() {
    return orderOfPrecedence;
  }

  public static SqrtOperator getInstance() {
    return instance;
  }

  // Same method we are using for square root and module operators.
  @Override
  public double eval(double operand1, double operand2) {
    return Math.sqrt(operand1);
  }

  @Override
  public int compareTo(IOperator o) {
    if (orderOfPrecedence > o.getOrderOfPrecedence()) {
      return 1;
    } else if (orderOfPrecedence < o.getOrderOfPrecedence()) {
      return -1;
    } else {
      return 0;
    }
  }
}
