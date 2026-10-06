package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the FlushEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FlushEvaluator
 */
public class FlushEvaluatorTest {
    @Test
    public void testIsMatchFullSuit() {
        List<Card> hand = Card.parseAll("AH 6H 5H 3H 2H");
        Assertions.assertTrue(new FlushEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFullSuit() {
        List<Card> hand = Card.parseAll("AC 6H 5H 3H 2H");
        Assertions.assertFalse(new FlushEvaluator().isMatch(hand));
    }
}
