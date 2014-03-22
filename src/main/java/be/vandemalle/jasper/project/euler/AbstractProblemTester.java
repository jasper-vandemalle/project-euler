package be.vandemalle.jasper.project.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Abstract class using JUnit to solve the problem and compare it to a known answer.
 *
 * @author Jasper Vandemalle
 */
public abstract class AbstractProblemTester implements Solvable {
    /**
     * Run JUnit to test our solution.
     */
    @Test
    public void testProblem() {
        String answer = getAnswer();
        String solution = solve();
        assertEquals(answer, solution);
    }
}
