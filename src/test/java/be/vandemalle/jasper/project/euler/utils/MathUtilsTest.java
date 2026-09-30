package be.vandemalle.jasper.project.euler.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
    @Test
    void gcd() {
        assertEquals(6, MathUtils.gcd(54, 24));
        assertEquals(1, MathUtils.gcd(17, 5));
        assertEquals(7, MathUtils.gcd(7, 0));
    }

    @Test
    void digitSum() {
        assertEquals(0, MathUtils.digitSum(BigInteger.ZERO));
        assertEquals(26, MathUtils.digitSum(BigInteger.TWO.pow(15)));
    }

    @Test
    void findMaximumTriangularPathSum() {
        int[][] triangle = {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};

        assertEquals(23, MathUtils.findMaximumTriangularPathSum(triangle));
    }

    @Test
    void findMaximumTriangularPathSumLeavesTheTriangleUnchanged() {
        int[][] triangle = {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}};

        MathUtils.findMaximumTriangularPathSum(triangle);

        assertArrayEquals(new int[][] {{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}}, triangle);
    }
}
