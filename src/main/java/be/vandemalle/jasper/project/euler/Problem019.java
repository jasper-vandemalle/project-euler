package be.vandemalle.jasper.project.euler;

import java.util.Calendar;

/**
 * Solution to Project Euler problem 19.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=19">http://projecteuler.net/problem=19</a>
 */
public class Problem019 extends ProblemTester {
	/** The Constant ANSWER. */
	private static final String ANSWER = "171";

	/** {@inheritDoc} */
	@Override
	public String solve() {
		Calendar shiftDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		shiftDate.set(1_901, Calendar.JANUARY, 1);
		endDate.set(2_000, Calendar.DECEMBER, 31);

		int count = 0;

		while (shiftDate.before(endDate)) {
			if (shiftDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
			}

			shiftDate.add(Calendar.MONTH, 1);
		}

		return Integer.toString(count);
	}

	/** {@inheritDoc} */
	@Override
	public String getAnswer() {
		return ANSWER;
	}
}