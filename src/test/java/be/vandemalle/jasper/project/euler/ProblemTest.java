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

	@Test
	public void testProblem2() {
		assertEquals("4613732", new Problem2().solve());
	}

	@Test
	public void testProblem3() {
		assertEquals("6857", new Problem3().solve());
	}

	@Test
	public void testProblem4() {
		assertEquals("906609", new Problem4().solve());
	}
}
