package be.vandemalle.jasper.project.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Abstract class using JUnit to solve the problem and compare it to a known answer.
 * 
 * @author Jasper Vandemalle
 */
public abstract class ProblemTester implements Solvable {
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