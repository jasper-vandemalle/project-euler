package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the OnePairEvaluator.
 *
 * @author Jasper Vandemalle
 * @see OnePairEvaluator
 */
class OnePairEvaluatorTest {
    @Test
    void isMatchOnePair() {
        List<Card> hand = Card.parseAll("AH 7H 7C 6D 6S");
        assertTrue(new OnePairEvaluator().isMatch(hand));
    }

    @Test
    void isMatchNoOnePair() {
        List<Card> hand = Card.parseAll("AH 7H 6C 5D 4S");
        assertFalse(new OnePairEvaluator().isMatch(hand));
    }
}
