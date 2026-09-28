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
        // max long = (2^63)-1
        String numStr = BigInteger.valueOf(2).pow(1_000).toString();
        return Integer.toString(MathUtils.countSumOfDigits(numStr));
    }
}
