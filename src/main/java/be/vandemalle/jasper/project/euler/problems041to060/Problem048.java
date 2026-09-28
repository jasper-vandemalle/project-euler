package be.vandemalle.jasper.project.euler.problems041to060;

import be.vandemalle.jasper.project.euler.Solvable;
import java.math.BigInteger;

/**
 * Self powers.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=48">Project Euler problem 48</a>
 */
public class Problem048 implements Solvable {
    @Override
    public String solve() {
        // only the last ten digits matter, so everything can be done modulo 10^10
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger sumOfSelfPowers = BigInteger.ZERO;

        for (int i = 1; i <= 1_000; i++) {
            BigInteger n = BigInteger.valueOf(i);
            sumOfSelfPowers = sumOfSelfPowers.add(n.modPow(n, modulus));
        }

        return String.format("%010d", sumOfSelfPowers.mod(modulus));
    }
}
