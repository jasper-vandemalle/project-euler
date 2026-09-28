package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.Resources;
import java.util.Arrays;
import java.util.List;

/**
 * Names scores.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=22">Project Euler problem 22</a>
 */
public class Problem022 implements Solvable {
    @Override
    public String solve() {
        List<String> names = Arrays.stream(Resources.readString(Problem022.class, "Problem022-names.txt")
                        .trim()
                        .split(","))
                .map(quotedName -> quotedName.replace("\"", ""))
                .sorted()
                .toList();

        long totalScore = 0;
        for (int i = 0; i < names.size(); i++) {
            totalScore += (long) (i + 1) * alphabeticalValue(names.get(i));
        }

        return Long.toString(totalScore);
    }

    /**
     * Sum of the letters' positions in the alphabet, e.g. COLIN is worth 3 + 15 + 12 + 9 + 14 = 53.
     */
    private static int alphabeticalValue(String name) {
        return name.chars().map(c -> c - 'A' + 1).sum();
    }
}
