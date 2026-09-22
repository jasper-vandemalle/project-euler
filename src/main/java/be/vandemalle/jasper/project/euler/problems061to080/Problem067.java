package be.vandemalle.jasper.project.euler.problems061to080;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.utils.Resources;
import be.vandemalle.jasper.project.euler.utils.MathUtils;
import com.google.common.primitives.Ints;


/**
 * Solution to Project Euler problem 67.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=67">http://projecteuler.net/problem=67</a>
 */
public class Problem067 implements Solvable {
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
        String rawTriangle = Resources.readString(Problem067.class, "Problem067-triangle.txt");
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
}
