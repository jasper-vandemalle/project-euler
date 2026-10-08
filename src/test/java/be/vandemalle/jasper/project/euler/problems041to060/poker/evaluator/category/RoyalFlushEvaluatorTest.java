package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the RoyalFlushEvaluator.
 *
 * @author Jasper Vandemalle
 * @see RoyalFlushEvaluator
 */
class RoyalFlushEvaluatorTest {
    @Test
    void isMatchRoyalFlush() {
        List<Card> hand = Card.parseAll("AH KH QH JH TH");
        assertTrue(new RoyalFlushEvaluator().isMatch(hand));
    }

    @Test
    void isMatchNoRoyalFlush() {
        List<Card> hand = Card.parseAll("AC KH QH JH TH");
        assertFalse(new RoyalFlushEvaluator().isMatch(hand));
    }
}
