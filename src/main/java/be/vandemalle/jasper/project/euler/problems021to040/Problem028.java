package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Number spiral diagonals.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=28">Project Euler problem 28</a>
 */
public class Problem028 implements Solvable {
    private static final int SIZE = 1_001;

    @Override
    public String solve() {
        // walking outwards from the 1 in the centre, layer k has four corners that are each 2k apart:
        // 1; 3, 5, 7, 9; 13, 17, 21, 25; 31, 37, ...
        int sumOfDiagonals = 1;
        int corner = 1;

        for (int layer = 1; layer <= SIZE / 2; layer++) {
            for (int side = 0; side < 4; side++) {
                corner += 2 * layer;
                sumOfDiagonals += corner;
            }
        }

        return Integer.toString(sumOfDiagonals);
    }
}
