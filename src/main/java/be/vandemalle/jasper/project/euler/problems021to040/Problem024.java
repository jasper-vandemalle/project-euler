package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;
import java.util.ArrayList;
import java.util.List;

/**
 * Lexicographic permutations.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=24">Project Euler problem 24</a>
 */
public class Problem024 implements Solvable {
    @Override
    public String solve() {
        List<Integer> digits = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        // permutations are zero-indexed, so the millionth one has index 999 999
        int remaining = 1_000_000 - 1;
        StringBuilder permutation = new StringBuilder();

        // each leading digit fixes a block of (n - 1)! permutations
        while (!digits.isEmpty()) {
            int blockSize = factorial(digits.size() - 1);
            permutation.append(digits.remove(remaining / blockSize));
            remaining %= blockSize;
        }

        return permutation.toString();
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
