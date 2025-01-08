package dsa;

/**
 *
 * @author arnel
 */

/*
*  Check if a string of parentheses is balanced, meaning each opening parenthesis has a corresponding closing parenthesis in the correct order. 
* The output of each check should be either true or false. Use the following examples to be evaluated:
* parentheses1 = ( ( ( ) ) )
* parentheses2 = ( ( ) ( ) )
* parentheses3 = ( ( )
* parentheses4 = ( ) )
 */
import java.util.Stack;

public class StackExercise1 {

    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char c : parentheses.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] parentheses = {"( ( ( ) ) )", "( ( ) ( ) )", "( ( )", "( ) )"};
        for (String s : parentheses) {
            System.out.printf("%s: %b%n", s, isBalanced(s));
        }
    }

}
