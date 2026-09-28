package be.vandemalle.jasper.project.euler.problems061to080;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.MathUtils;
import be.vandemalle.jasper.project.euler.utils.Resources;
import java.util.Arrays;

/**
 * Maximum path sum II.
 *
 * <p>The same problem as 18, only with a triangle too large to brute force.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=67">Project Euler problem 67</a>
 */
public class Problem067 implements Solvable {
    @Override
    public String solve() {
        int[][] triangle = Resources.readLines(Problem067.class, "Problem067-triangle.txt").stream()
                .map(row -> Arrays.stream(row.trim().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);

        return Integer.toString(MathUtils.findMaximumTriangularPathSum(triangle));
    }
}
