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

	@Test
	public void testProblem5() {
		assertEquals("232792560", new Problem5().solve());
	}

	@Test
	public void testProblem6() {
		assertEquals("25164150", new Problem6().solve());
	}

	@Test
	public void testProblem7() {
		assertEquals("104743", new Problem7().solve());
	}

	@Test
	public void testProblem8() {
		assertEquals("40824", new Problem8().solve());
	}

	@Test
	public void testProblem9() {
		assertEquals("31875000", new Problem9().solve());
	}

	@Test
	public void testProblem10() {
		assertEquals("142913828922", new Problem10().solve());
	}
}
