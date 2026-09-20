package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;

/**
 * Solution to Project Euler problem 15.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=15">http://projecteuler.net/problem=15</a>
 */
public class Problem015 implements Solvable {
    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        BigInteger result = BigIntegerMath.binomial(40, 20);
        return result.toString();
    }
}
