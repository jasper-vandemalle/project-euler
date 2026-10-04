package be.vandemalle.jasper.project.euler.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 10, 25, 97, 100, 1_000})
    void sieveMatchesTrialDivision(int upperBoundary) {
        int[] expected = IntStream.rangeClosed(2, upperBoundary)
                .filter(PrimeUtilsTest::isPrime)
                .toArray();

        assertArrayEquals(expected, PrimeUtils.sieveOfAtkin(upperBoundary));
    }

    @Test
    void countsPrimesBelowOneMillion() {
        assertEquals(78_498, PrimeUtils.sieveOfAtkin(1_000_000).length);
    }

    private static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(d -> n % d == 0);
    }
}
