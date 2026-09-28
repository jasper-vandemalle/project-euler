package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.MathUtils;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Factorial digit sum.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=20">Project Euler problem 20</a>
 */
public class Problem020 implements Solvable {
    @Override
    public String solve() {
        BigInteger factorialOfHundred = IntStream.rangeClosed(2, 100)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        int sumOfDigits = MathUtils.countSumOfDigits(factorialOfHundred.toString());
        return Integer.toString(sumOfDigits);
    }
}
