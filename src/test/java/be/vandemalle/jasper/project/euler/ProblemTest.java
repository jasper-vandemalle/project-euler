package be.vandemalle.jasper.project.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Testing all problems against their known solutions.
 * 
 * @author Jasper Vandemalle
 * 
 */
public class ProblemTest {
	@Test
	public void testProblem1() {
		assertEquals("233168", new Problem1().solve());
	}
}
