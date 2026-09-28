package be.vandemalle.jasper.project.euler.problems001to020;

import be.vandemalle.jasper.project.euler.Solvable;
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Counting Sundays.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=19">Project Euler problem 19</a>
 */
public class Problem019 implements Solvable {
    @Override
    public String solve() {
        int sundays = 0;

        for (var date = LocalDate.of(1901, 1, 1); date.getYear() <= 2000; date = date.plusMonths(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundays++;
            }
        }

        return Integer.toString(sundays);
    }
}
