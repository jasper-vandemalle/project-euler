package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the RoyalFlushEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.RoyalFlushEvaluator
 */
public class RoyalFlushEvaluatorTest {
    @Test
    public void testIsMatchRoyalFlush() {
        List<Card> hand = Card.parseAll("AH KH QH JH TH");
        Assertions.assertTrue(new RoyalFlushEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoRoyalFlush() {
        List<Card> hand = Card.parseAll("AC KH QH JH TH");
        Assertions.assertFalse(new RoyalFlushEvaluator().isMatch(hand));
    }
}
