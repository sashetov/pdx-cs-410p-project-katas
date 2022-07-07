package edu.pdx.cs410J.AlexJacobDylan;

/**
 * FooBarQix class
 *
 * @author Alex
 * @author Jacob
 * @version 1.0
 * @since 1.0
 */
public class FooBarQix {

  public static void main(String[] args) {
    if (args.length == 1) {
      System.out.print(compute(args[0]));
    } else {
      System.err.println("Missing command line arguments or too many. Please run with only one command-line argument!");
    }
  }

  /**
   * Computes the FooBarQix string given the specified argument.
   *
   * @param arg Input argument which will be turned into an integer.
   * @return A {@link String} with "Foo", "Bar", and/or "Qix" depending on the following:
   * <p>If the number is divisible by 3, write “Foo” instead of the number</p>
   * <p>If the number is divisible by 5, add “Bar”</p>
   * <p>If the number is divisible by 7, add “Qix”</p>
   */
  public static String compute(String arg) {
    String ret = "";
    try {
      int i = Integer.parseInt(arg);
      if (i % 3 == 0) {
        ret += "Foo";
      }
      if (i % 5 == 0) {
        ret += "Bar";
      }
      if (i % 7 == 0) {
        ret += "Qix";
      }
      for (i=0; i < arg.length(); i++){
        switch(arg.charAt(i)){
          case '3':
            ret += "Foo";
            break;
          case '5':
            ret += "Bar";
            break;
          case '7':
            ret += "Qix";
            break;
        }
      }
    } catch (NumberFormatException ex) {
      System.err.println("Invalid argument given, '" + arg + "'. Argument must an integer.");
    }
    if (ret.equals("")) return arg;
    return ret;
  }
}