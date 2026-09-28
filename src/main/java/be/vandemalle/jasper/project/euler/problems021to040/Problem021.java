package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Amicable numbers.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=21">Project Euler problem 21</a>
 */
public class Problem021 implements Solvable {
    @Override
    public String solve() {
        int sumOfAmicableNumbers = 0;

        for (int i = 2; i < 10_000; i++) {
            int partner = sumOfProperDivisors(i);
            if (partner != i && sumOfProperDivisors(partner) == i) {
                sumOfAmicableNumbers += i;
            }
        }

        return Integer.toString(sumOfAmicableNumbers);
    }

    private static int sumOfProperDivisors(int n) {
        if (n < 2) {
            return 0;
        }

        // divisors come in pairs (i, n / i), so checking up to the square root is enough
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
