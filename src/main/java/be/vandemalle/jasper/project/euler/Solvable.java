package be.vandemalle.jasper.project.euler;

/**
 * A solvable Project Euler problem.
 *
 * @author Jasper Vandemalle
 */
@FunctionalInterface
public interface Solvable {
    /**
     * Solve the problem and return the answer.
     *
     * @return the answer to the problem
     */
    String solve();
}
