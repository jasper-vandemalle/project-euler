package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the FlushEvaluator.
 *
 * @author Jasper Vandemalle
 * @see FlushEvaluator
 */
class FlushEvaluatorTest {
    @Test
    void isMatchFullSuit() {
        List<Card> hand = Card.parseAll("AH 6H 5H 3H 2H");
        assertTrue(new FlushEvaluator().isMatch(hand));
    }

    @Test
    void isMatchNoFullSuit() {
        List<Card> hand = Card.parseAll("AC 6H 5H 3H 2H");
        assertFalse(new FlushEvaluator().isMatch(hand));
    }
}
