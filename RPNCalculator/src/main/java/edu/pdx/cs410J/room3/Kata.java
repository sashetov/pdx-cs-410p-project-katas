package edu.pdx.cs410J.room3;

import java.util.*;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 *
 * @author Alex Vassilevski
 * @author Anna Kawasaki
 * @author Tam Nguyen
 * @author Jacob Landstrom
 * @author Vidyavarshini Holenarasipur Jayashankar
 */
public class Kata {

  public static void main(String[] args) {
    /**
     *  RPN Calculator
     *
     * An RPN calculator computes expressions written in Reverse Polish Notation.
     *
     * An RPN expression or postfix expression is one of the following :
     *
     *     a number X, in wich case the value of the expression is that of X,
     *     a sequence of form E1 E2 OP where E1 and E2 are RPN expressions and OP is an arithmetic operation.
     *
     * Samples :
     *
     * 20 5 /        => 20/5 = 4
     * 4 2 + 3 -     => (4+2)-3 = 3
     * 3 5 8 * 7 + * => ((5*8)+7)*3 = 141
     *
     * Add the SQRT operation :
     *
     * 9 SQRT => √9 = 3
     *
     * Add the MAX operation :
     *
     * 5 3 4 2 9 1 MAX   => MAX(5, 3, 4, 2, 9, 1) = 9
     * 4 5 MAX 1 2 MAX * => MAX(4,5) * MAX(1,2) = 10
     */
    //args validate

    if (args.length < 1) {
      System.err.println("Missing command line arguments");
      return;
    }

    Stack<String> stack = new Stack<>();
    for (String arg : args) {
      List<Integer> maxList = new ArrayList<Integer>();
      if (isNumber(arg)) {
        stack.push(arg);
      } else if (isOperator(arg)) {
        if(arg.equals("MAX")) {
          while (!stack.isEmpty()) {
            if (isNumber(stack.peek())) {
              maxList.add(Integer.parseInt(stack.pop()));
            }
          }
        }
        else if(arg.equals("SQRT")){
          maxList.add(Integer.parseInt(stack.pop()));
        }
        else{
          maxList.add(Integer.parseInt(stack.pop()));
          maxList.add(Integer.parseInt(stack.pop()));
        }
      } else {
        System.err.println("The argument '" + arg + "' is not a number or valid operator! Please double check your command line arguments and try again!");
      }

      switch (arg) {
        case "+":
          stack.push("" + (maxList.get(1) + maxList.get(0)));
          break;
        case "-":
          stack.push("" + (maxList.get(1) - maxList.get(0)));
          break;
        case "*":
          stack.push("" + (maxList.get(1) * maxList.get(0)));
          break;
        case "/":
          stack.push("" + (maxList.get(1) / maxList.get(0)));
          break;
        case "MAX":
          //stack.push("" + maxList.stream().max(Integer::compare));
          stack.push("" + Collections.max(maxList));
          break;
        /*case "SQRT":
          stack.push("" + Math.sqrt(operand1, operand2));
          break;*/
        default:
          break;
      }
    }

    System.out.println("Result: " + Integer.parseInt(stack.pop()));
  }

  /**
   * Checks if the given {@link String} is an integer.
   *
   * @param input The input {@link String} to check.
   * @return {@code true} if the given input is an integer, {@code false} otherwise.
   */
  private static boolean isNumber(final String input) {
    try {
      Integer.parseInt(input);
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  /**
   * Checks if the given {@link String} is a valid operator.
   *
   * @param input The input {@link String} to check.
   * @return {@code true} if the given input is a valid operator, {@code false} otherwise.
   */
  private static boolean isOperator(final String input) {
    return Arrays.asList("+", "-", "/", "*", "SQRT", "MAX").contains(input);
  }
}