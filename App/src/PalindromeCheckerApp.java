import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * UC5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Stack data structure.
 *
 * Flow:
 * - Push characters into stack
 * - Pop characters and compare with original string
 * - Display the validation result
 *
 * Key Concepts:
 * - Stack (LIFO principle)
 * - Push Operation
 * - Pop Operation
 * - Reversal Logic using Stack
 *
 * @author ,manisha
 * @version 5.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Variable to track palindrome status
        boolean isPalindrome = true;

        // Pop characters from stack and compare with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
