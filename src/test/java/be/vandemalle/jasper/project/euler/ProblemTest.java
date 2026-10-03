package be.vandemalle.jasper.project.euler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Named.named;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import be.vandemalle.jasper.project.euler.problems001to020.Problem001;
import be.vandemalle.jasper.project.euler.problems001to020.Problem002;
import be.vandemalle.jasper.project.euler.problems001to020.Problem003;
import be.vandemalle.jasper.project.euler.problems001to020.Problem004;
import be.vandemalle.jasper.project.euler.problems001to020.Problem005;
import be.vandemalle.jasper.project.euler.problems001to020.Problem006;
import be.vandemalle.jasper.project.euler.problems001to020.Problem007;
import be.vandemalle.jasper.project.euler.problems001to020.Problem008;
import be.vandemalle.jasper.project.euler.problems001to020.Problem009;
import be.vandemalle.jasper.project.euler.problems001to020.Problem010;
import be.vandemalle.jasper.project.euler.problems001to020.Problem011;
import be.vandemalle.jasper.project.euler.problems001to020.Problem012;
import be.vandemalle.jasper.project.euler.problems001to020.Problem013;
import be.vandemalle.jasper.project.euler.problems001to020.Problem014;
import be.vandemalle.jasper.project.euler.problems001to020.Problem015;
import be.vandemalle.jasper.project.euler.problems001to020.Problem016;
import be.vandemalle.jasper.project.euler.problems001to020.Problem017;
import be.vandemalle.jasper.project.euler.problems001to020.Problem018;
import be.vandemalle.jasper.project.euler.problems001to020.Problem019;
import be.vandemalle.jasper.project.euler.problems001to020.Problem020;
import be.vandemalle.jasper.project.euler.problems021to040.Problem021;
import be.vandemalle.jasper.project.euler.problems021to040.Problem022;
import be.vandemalle.jasper.project.euler.problems021to040.Problem024;
import be.vandemalle.jasper.project.euler.problems021to040.Problem025;
import be.vandemalle.jasper.project.euler.problems021to040.Problem028;
import be.vandemalle.jasper.project.euler.problems021to040.Problem036;
import be.vandemalle.jasper.project.euler.problems041to060.Problem048;
import be.vandemalle.jasper.project.euler.problems041to060.Problem054;
import be.vandemalle.jasper.project.euler.problems061to080.Problem067;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Checks every solution against its known answer.
 *
 * @author Jasper Vandemalle
 */
class ProblemTest {
    static Stream<Arguments> problems() {
        return Stream.of(
                problem(1, new Problem001(), "233168"),
                problem(2, new Problem002(), "4613732"),
                problem(3, new Problem003(), "6857"),
                problem(4, new Problem004(), "906609"),
                problem(5, new Problem005(), "232792560"),
                problem(6, new Problem006(), "25164150"),
                problem(7, new Problem007(), "104743"),
                problem(8, new Problem008(), "23514624000"),
                problem(9, new Problem009(), "31875000"),
                problem(10, new Problem010(), "142913828922"),
                problem(11, new Problem011(), "70600674"),
                problem(12, new Problem012(), "76576500"),
                problem(13, new Problem013(), "5537376230"),
                problem(14, new Problem014(), "837799"),
                problem(15, new Problem015(), "137846528820"),
                problem(16, new Problem016(), "1366"),
                problem(17, new Problem017(), "21124"),
                problem(18, new Problem018(), "1074"),
                problem(19, new Problem019(), "171"),
                problem(20, new Problem020(), "648"),
                problem(21, new Problem021(), "31626"),
                problem(22, new Problem022(), "871198282"),
                problem(24, new Problem024(), "2783915460"),
                problem(25, new Problem025(), "4782"),
                problem(28, new Problem028(), "669171001"),
                problem(36, new Problem036(), "872187"),
                problem(48, new Problem048(), "9110846700"),
                problem(54, new Problem054(), "376"),
                problem(67, new Problem067(), "7273"));
    }

    private static Arguments problem(int number, Solvable solvable, String answer) {
        return arguments(named("Problem " + number, solvable), answer);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("problems")
    void solvesProblem(Solvable solvable, String answer) {
        assertEquals(answer, solvable.solve());
    }
}
