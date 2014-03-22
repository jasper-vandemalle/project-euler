package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;

/**
 * Solution to Project Euler problem 15.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=15">http://projecteuler.net/problem=15</a>
 */
public class Problem015 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "137846528820";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        BigInteger result = BigIntegerMath.binomial(40, 20);
        return result.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
