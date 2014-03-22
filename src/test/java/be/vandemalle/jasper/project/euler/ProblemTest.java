package be.vandemalle.jasper.project.euler;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.reflections.Reflections;

import java.util.Set;

/**
 * Testing all problems against their known solutions.
 *
 * @author Jasper Vandemalle
 */
public class ProblemTest {
    /**
     * A set with all testable problem classes.
     */
    private static Set<Class<? extends AbstractProblemTester>> classes;

    /**
     * Set up the test.
     */
    @BeforeClass
    public static void setUp() {
        Reflections reflections = new Reflections("be.vandemalle.jasper.project.euler");
        classes = reflections.getSubTypesOf(AbstractProblemTester.class);
    }

    /**
     * Test all {@link AbstractProblemTester} classes against their known solution.
     *
     * @throws InstantiationException the instantiation exception
     * @throws IllegalAccessException the illegal access exception
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testProblems() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        for (Class<? extends AbstractProblemTester> c : classes) {
            Solvable solvable = (Solvable) Class.forName(c.getName()).newInstance();
            Assert.assertEquals(c.getSimpleName() + " failed", solvable.getAnswer(), solvable.solve());
        }
    }
}
