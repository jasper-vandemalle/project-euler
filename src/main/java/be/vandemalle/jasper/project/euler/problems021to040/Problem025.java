package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;
import java.math.BigInteger;

/**
 * Solution to Project Euler problem 25.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=25">http://projecteuler.net/problem=25</a>
 */
public class Problem025 implements Solvable {
    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        // start from 1 since current: Fib(1) = 1
        int index = 1;

        while (current.toString().length() < 1_000) {
            BigInteger temp = current;
            current = previous.add(current);
            previous = temp;

            index++;
        }

        return Long.toString(index);
    }
}
