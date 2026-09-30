package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.MathUtils;
import java.math.BigInteger;

/**
 * Power digit sum.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=16">Project Euler problem 16</a>
 */
public class Problem016 implements Solvable {
    @Override
    public String solve() {
        // 2^1000 is far beyond the range of a long
        return Integer.toString(MathUtils.digitSum(BigInteger.TWO.pow(1_000)));
    }
}
