package be.vandemalle.jasper.project.euler.utils;

/**
 * Utility class for text related functions.
 *
 * @author Jasper Vandemalle
 */
public class TextUtils {
    /**
     * Test if a certain number is a palindrome.
     *
     * @param i the number to test
     * @return <code>true</code> if the number is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(int i) {
        String s = Integer.toString(i);
        return isPalindrome(s);
    }

    /**
     * Test if a certain string is a palindrome.
     *
     * @param s the string to test
     * @return <code>true</code> if the string is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}
