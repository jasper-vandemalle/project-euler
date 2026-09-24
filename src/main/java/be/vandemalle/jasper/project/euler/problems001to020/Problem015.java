package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

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
        // a path through a 20x20 grid is 40 moves, of which 20 go right: C(40, 20)
        long paths = 1;
        for (int k = 1; k <= 20; k++) {
            paths = paths * (20 + k) / k;
        }
        return Long.toString(paths);
    }
}
