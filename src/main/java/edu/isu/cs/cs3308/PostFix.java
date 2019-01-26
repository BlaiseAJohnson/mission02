package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.impl.LinkedStack;

/**
 * Postfix expression evaluator.
 *
 * @author Isaac Griffith
 */
public class PostFix {

    /**
     * Evaluates the provided postfix expression and returns the answer. If the
     * provided string is null, empty, or only contains whitespace then return
     * 0;
     *
     * @param postfix A string representing an postfix notation expression where
     * each item is separated by a space.
     * @return value of the postfix express or 0 if the postfix expression is null,
     * empty, or contains only whitespace.
     */
    public static int evalPostFix(String postfix) {
        if (postfix == null || postfix.replaceAll(" ", "").equals("")) return 0;

        LinkedStack<Integer> stack = new LinkedStack<>();

        String[] equation = postfix.split(" ");

        for (String currentSymbol : equation) {

            if (!currentSymbol.equals(" ")) {
                if (intTryParse(currentSymbol)) {
                    int currentNum = Integer.parseInt(currentSymbol);
                    stack.push(currentNum);
                }
                else performOperation(currentSymbol, stack);
            }
        }

        return stack.pop();
    }

    /**
     * Determines whether a string can be parsed into an integer.
     * @param intChar The string for which to determine the ability to be parsed.
     * @return A boolean representing whether the string is able to be parsed.
     */
    private static boolean intTryParse(String intChar) {
        try {
            Integer.parseInt(intChar);

            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Performs the specified operation on the top two elements of the stack,
     * then pushes the result back onto the stack.
     * @param operator The operator to perform as a string.
     * @param stack The stack upon which to perform the operation.
     */
    private static void performOperation(String operator, LinkedStack<Integer> stack) {
        if (stack.size() < 2) throw new IllegalArgumentException();

        int num2 = stack.pop();
        int num1 = stack.pop();

        switch (operator) {
            case "+":
                stack.push(num1 + num2);
                break;
            case "-":
                stack.push(num1 - num2);
                break;
            case "*":
                stack.push(num1 * num2);
                break;
            case "/":
                stack.push(num1 / num2);
                break;
            default:
                stack.push(num1);
                stack.push(num2);
                break;
        }
    }
}
