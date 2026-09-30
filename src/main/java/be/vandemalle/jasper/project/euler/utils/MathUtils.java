package be.vandemalle.jasper.project.euler.utils;

import java.math.BigInteger;

/**
 * Utility class for math related functions.
 *
 * @author Jasper Vandemalle
 */
public final class MathUtils {
    private MathUtils() {}

    /**
     * Greatest common divisor, using Euclid's algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor of a and b
     */
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Sum the decimal digits of a non-negative number.
     *
     * @param number the number
     * @return the sum of its digits
     */
    public static int digitSum(BigInteger number) {
        return number.toString().chars().map(c -> c - '0').sum();
    }

    /**
     * Find the sum of all values on the maximum path from the top of a triangle to its bottom row.
     *
     * <p>Rather than trying every path, work upwards from the second to last row and add the larger of the two
     * values below to each cell. The top then holds the answer:
     *
     * <pre>
     *          03                    03              03        23
     *       07    04              07    04        20    19
     *    02    04    06        10    13    15
     * 08    05    09    03
     * </pre>
     *
     * @param triangle the triangle, which is left unchanged
     * @return the sum of all values in the maximum path
     */
    public static int findMaximumTriangularPathSum(int[][] triangle) {
        int[] sums = triangle[triangle.length - 1].clone();

        for (int row = triangle.length - 2; row >= 0; row--) {
            for (int col = 0; col < triangle[row].length; col++) {
                sums[col] = triangle[row][col] + Math.max(sums[col], sums[col + 1]);
            }
        }

        return sums[0];
    }
}
