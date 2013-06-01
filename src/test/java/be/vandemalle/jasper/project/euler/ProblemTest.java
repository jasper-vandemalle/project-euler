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
	public void testProblem001() {
		assertEquals("233168", new Problem001().solve());
	}

	@Test
	public void testProblem002() {
		assertEquals("4613732", new Problem002().solve());
	}

	@Test
	public void testProblem003() {
		assertEquals("6857", new Problem003().solve());
	}

	@Test
	public void testProblem004() {
		assertEquals("906609", new Problem004().solve());
	}

	@Test
	public void testProblem005() {
		assertEquals("232792560", new Problem005().solve());
	}

	@Test
	public void testProblem006() {
		assertEquals("25164150", new Problem006().solve());
	}

	@Test
	public void testProblem007() {
		assertEquals("104743", new Problem007().solve());
	}

	@Test
	public void testProblem008() {
		assertEquals("40824", new Problem008().solve());
	}

	@Test
	public void testProblem009() {
		assertEquals("31875000", new Problem009().solve());
	}

	@Test
	public void testProblem010() {
		assertEquals("142913828922", new Problem010().solve());
	}

	@Test
	public void testProblem011() {
		assertEquals("70600674", new Problem011().solve());
	}

	@Test
	public void testProblem012() {
		assertEquals("76576500", new Problem012().solve());
	}

	@Test
	public void testProblem013() {
		assertEquals("5537376230", new Problem013().solve());
	}

	@Test
	public void testProblem014() {
		assertEquals("837799", new Problem014().solve());
	}

	@Test
	public void testProblem015() {
		assertEquals("137846528820", new Problem015().solve());
	}

	@Test
	public void testProblem016() {
		assertEquals("1366", new Problem016().solve());
	}
}
