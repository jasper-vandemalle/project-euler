package be.vandemalle.jasper.project.euler.problems021to040;

import java.util.Collection;
import java.util.List;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;

import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Longs;

/**
 * Solution to Project Euler problem 24.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=24">http://projecteuler.net/problem=24</a>
 */
public class Problem024 extends AbstractProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "2783915460";

	/** The Constant PERMUTATION_DIGITS. */
	private static final long[] PERMUTATION_DIGITS = new long[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	/** {@inheritDoc} */
	@Override
	public String solve() {
		List<Long> permDigitList = Longs.asList(PERMUTATION_DIGITS);
		Collection<List<Long>> orderedPermutations = Collections2.orderedPermutations(permDigitList);
		List<Long> MILLIONTH_PERMUTATION = Iterators.get(orderedPermutations.iterator(), 1_000_000 - 1);
		return Joiner.on("").join(MILLIONTH_PERMUTATION);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}