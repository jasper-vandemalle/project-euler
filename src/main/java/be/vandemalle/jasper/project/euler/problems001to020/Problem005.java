package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.MathUtils;

/**
 * Smallest multiple.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=5">Project Euler problem 5</a>
 */
public class Problem005 implements Solvable {
    @Override
    public String solve() {
        long lcm = 1;

        for (int i = 2; i <= 20; i++) {
            lcm = lcm / MathUtils.gcd(lcm, i) * i;
        }

        return Long.toString(lcm);
    }
}
