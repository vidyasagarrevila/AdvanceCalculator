package calculator.operator;

/**
 * This class will provide module functionality and also adding comparable capabilities for the provided objects.
 * @author 4servadmin
 *
 */
public class ModulusOperator implements IOperator, Comparable<IOperator> {

  private static ModulusOperator instance = new ModulusOperator();

  private final char operator = '%';
  private final int orderOfPrecedence = 2;

  private ModulusOperator() {}

  public char getOperator() {
    return operator;
  }

  public int getOrderOfPrecedence() {
    return orderOfPrecedence;
  }

  public static ModulusOperator getInstance() {
    return instance;
  }

  // We are assuming both values are positive.
  @Override
  public double eval(double operand1, double operand2) {
    return operand1 % operand2;
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

  @Override
  public String toString() {
    return "ModulusOperator [operator=" + operator + ", orderOfPrecedence=" + orderOfPrecedence
        + "]";
  }
}
