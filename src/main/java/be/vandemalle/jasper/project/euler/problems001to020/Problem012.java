package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;

/**
 * Highly divisible triangular number.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=12">Project Euler problem 12</a>
 */
public class Problem012 implements Solvable {
    @Override
    public String solve() {
        for (int n = 1; ; n++) {
            // T(n) = n (n + 1) / 2, and n and n + 1 are coprime, so the divisor count splits into two
            // independent factors once the 2 is divided out of whichever one is even
            int divisors = n % 2 == 0
                    ? countDivisors(n / 2) * countDivisors(n + 1)
                    : countDivisors(n) * countDivisors((n + 1) / 2);

            if (divisors > 500) {
                return Long.toString((long) n * (n + 1) / 2);
            }
        }
    }

    private static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count += i * i == n ? 1 : 2;
            }
        }
        return count;
    }
}
