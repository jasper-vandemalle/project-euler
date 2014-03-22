package be.vandemalle.jasper.project.euler.utils;

/**
 * Utility class for math related functions.
 *
 * @author Jasper Vandemalle
 */
public class MathUtils {
    /**
     * Count the sum of digits of a number.
     *
     * @param number the number
     * @return the sum of digits
     */
    public static int countSumOfDigits(String number) {
        int sumOfDigits = 0;

        for (char c : number.toCharArray()) {
            sumOfDigits += Character.digit(c, 10);
        }
        return sumOfDigits;
    }

    /**
     * Find the sum off all values in the maximum path of a triangle:
     * <p/>
     * Calculating all paths is inefficient, calculating the max path between adjacent cells and reusing the sum off
     * their values as a lot faster. Example:
     * <p/>
     * <pre>
     *          03                    03              03        23
     *       07    04              07    04        20    19
     *    02    04    06        10    13    15
     * 08    05    09    03
     * </pre>
     *
     * @param triangle the triangle
     * @return the sum of all values in the maximum path
     */
    public static int findMaximumTriangularPathSum(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        return triangle[0][0];
    }
}
