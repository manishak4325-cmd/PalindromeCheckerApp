/**
 * =========================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * UC4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it into a character array and
 * comparing characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char[]
 * - Uses two-pointer approach
 * - Compares start & end characters
 * - Displays the validation result
 *
 * Key Concepts:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Time Complexity Awareness
 *
 * @MANISHA THE GREAT DEVELOPER
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
