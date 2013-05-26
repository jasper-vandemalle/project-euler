package be.vandemalle.jasper.project.euler.utils;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

import com.google.common.primitives.Ints;

/**
 * Utility class for code related to primes.
 * 
 * @author Jasper Vandemalle
 * 
 */
public final class PrimeUtils {
	/**
	 * Generate primes using the Sieve of Atkin.
	 * 
	 * @param upperBoundary the upper boundary of the sieve
	 * @return an array with the sieved primes
	 * @see <a href="http://en.wikipedia.org/wiki/Sieve_of_Atkin">http://en.wikipedia.org/wiki/Sieve_of_Atkin</a>
	 */
	public static int[] sieveOfAtkin(int upperBoundary) {
		BitSet isPrime = new BitSet(upperBoundary + 1);
		double sqrt = Math.sqrt(upperBoundary);

		for (int x = 1; x <= sqrt; x++) {
			for (int y = 1; y <= sqrt; y++) {
				int n = 4 * x * x + y * y;
				if (n <= upperBoundary && (n % 12 == 1 || n % 12 == 5)) {
					isPrime.flip(n);
				}

				n = 3 * x * x + y * y;
				if (n <= upperBoundary && (n % 12 == 7)) {
					isPrime.flip(n);
				}

				n = 3 * x * x - y * y;
				if (x > y && (n <= upperBoundary) && (n % 12 == 11)) {
					isPrime.flip(n);
				}
			}
		}
		for (int n = 5; n <= sqrt; n++) {
			if (isPrime.get(n)) {
				int s = n * n;
				for (int k = s; k <= upperBoundary; k += s) {
					isPrime.set(k, false);
				}
			}
		}
		int[] primes = new int[upperBoundary];
		int found = 0;
		if (upperBoundary > 2) {
			primes[found++] = 2;
		}
		if (upperBoundary > 3) {
			primes[found++] = 3;
		}
		for (int n = 5; n <= upperBoundary; n += 2) {
			if (isPrime.get(n)) {
				primes[found++] = n;
			}
		}
		return Arrays.copyOf(primes, found);
	}

	/**
	 * Generate primes using the Sieve of Atkin.
	 * 
	 * @param upperBoundary the upper boundary of the sieve
	 * @return a list with the sieved primes
	 * @see <a href="http://en.wikipedia.org/wiki/Sieve_of_Atkin">http://en.wikipedia.org/wiki/Sieve_of_Atkin</a>
	 */
	public static List<Integer> sieveOfAtkinAsList(int upperBoundary) {
		int[] primes = sieveOfAtkin(upperBoundary);
		return Ints.asList(primes);
	}
}