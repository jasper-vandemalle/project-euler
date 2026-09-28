package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;
import java.math.BigInteger;

/**
 * 1000-digit Fibonacci number.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=25">Project Euler problem 25</a>
 */
public class Problem025 implements Solvable {
    @Override
    public String solve() {
        // the smallest number with 1000 digits
        BigInteger threshold = BigInteger.TEN.pow(1_000 - 1);
        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        int index = 1;

        while (current.compareTo(threshold) < 0) {
            BigInteger next = previous.add(current);
            previous = current;
            current = next;
            index++;
        }

        return Integer.toString(index);
    }
}
