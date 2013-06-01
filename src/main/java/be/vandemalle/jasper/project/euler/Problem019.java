package be.vandemalle.jasper.project.euler;

import java.util.Calendar;

/**
 * Solution to Project Euler problem 19.
 * 
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=19">http://projecteuler.net/problem=19</a>
 */
public class Problem019 implements Solvable {
	/** {@inheritDoc} */
	@Override
	public String solve() {
		Calendar shiftDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		shiftDate.set(1901, Calendar.JANUARY, 1);
		endDate.set(2000, Calendar.DECEMBER, 31);

		int count = 0;

		while (shiftDate.before(endDate)) {
			if (shiftDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
			}

			shiftDate.add(Calendar.MONTH, 1);
		}

		return Integer.toString(count);
	}

	/**
	 * Run and solve the problem.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		System.out.println(new Problem019().solve());
	}
}