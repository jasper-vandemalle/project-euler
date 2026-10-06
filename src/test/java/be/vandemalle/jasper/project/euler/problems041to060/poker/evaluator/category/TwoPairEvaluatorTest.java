package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the TwoPairEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.TwoPairEvaluator
 */
public class TwoPairEvaluatorTest {
    @Test
    public void testIsMatchTwoPair() {
        List<Card> hand = Card.parseAll("AH 7H 7C 6D 6S");
        Assertions.assertTrue(new TwoPairEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoTwoPair() {
        List<Card> hand = Card.parseAll("AH 7H 6C 5D 4S");
        Assertions.assertFalse(new TwoPairEvaluator().isMatch(hand));
    }
}
