package be.vandemalle.jasper.project.euler.problems021to040;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Solution to Project Euler problem 22.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=22">http://projecteuler.net/problem=22</a>
 */
public class Problem022 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "871198282";

    /**
     * The Constant FILENAME.
     */
    private static final String FILENAME = "src/main/resources/be/vandemalle/jasper/project/euler/problems021to040/Problem022-names.txt";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        String namesString = readFile();
        List<String> names = getNames(namesString);
        long totalScore = 0;

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            int score = scoreName(name) * (i + 1);
            totalScore += score;
        }

        return Long.toString(totalScore);
    }

    /**
     * Score the name.<br/>
     * <q>ex: COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53</q>
     *
     * @param name the name
     * @return the score
     */
    private int scoreName(String name) {
        int score = 0;

        for (char c : name.toCharArray()) {
            score += Character.getNumericValue(c) - 9;
        }

        return score;
    }

    /**
     * Get the parsed names,remove quotes and sort them.
     *
     * @param namesString one huge string with names
     * @return a list with names sorted
     */
    private List<String> getNames(String namesString) {
        List<String> names = new ArrayList<>();

        for (String quotedName : namesString.split(Pattern.quote(","))) {
            // remove quotes
            names.add(quotedName.substring(1, quotedName.length() - 1));
        }

        // natural sorting
        Collections.sort(names);
        return names;
    }

    /**
     * Read the file with names.
     *
     * @return the names
     */
    private static String readFile() {
        File file = new File(FILENAME);

        try {
            return Files.toString(file, Charset.defaultCharset());
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
