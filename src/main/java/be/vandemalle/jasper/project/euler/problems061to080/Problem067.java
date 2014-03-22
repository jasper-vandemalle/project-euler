package be.vandemalle.jasper.project.euler.problems061to080;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import be.vandemalle.jasper.project.euler.utils.MathUtils;
import com.google.common.io.Files;
import com.google.common.primitives.Ints;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Solution to Project Euler problem 67.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=67">http://projecteuler.net/problem=67</a>
 */
public class Problem067 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "7273";

    /**
     * The Constant FILENAME.
     */
    private static final String FILENAME = "src/main/resources/be/vandemalle/jasper/project/euler/problems061to080/Problem067-triangle.txt";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        // This is the same problem as #18
        int[][] triangle = parseTriangle();
        int pathSum = MathUtils.findMaximumTriangularPathSum(triangle);
        return Integer.toString(pathSum);
    }

    /**
     * Read and parse the triangle file.
     *
     * @return a parsed triangle array
     */
    private int[][] parseTriangle() {
        String rawTriangle = readFile();
        String[] rawTriangleLines = rawTriangle.split("\\r?\\n");
        int[][] triangle = new int[rawTriangleLines.length][];

        for (int i = 0; i < rawTriangleLines.length; i++) {
            String[] rawTriangleValues = rawTriangleLines[i].split(" ");
            triangle[i] = new int[rawTriangleValues.length];

            for (int j = 0; j < rawTriangleValues.length; j++) {
                triangle[i][j] = Ints.tryParse(rawTriangleValues[j]);
            }
        }

        return triangle;
    }

    /**
     * Read the triangle file.
     *
     * @return the file as a string
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
