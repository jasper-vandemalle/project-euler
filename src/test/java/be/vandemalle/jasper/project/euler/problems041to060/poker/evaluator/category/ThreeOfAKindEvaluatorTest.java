package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the ThreeOfAKindEvaluator.
 *
 * @author Jasper Vandemalle
 * @see ThreeOfAKindEvaluator
 */
class ThreeOfAKindEvaluatorTest {
    @Test
    void isMatchThree() {
        List<Card> hand = Card.parseAll("AH AC 6C 6D 6S");
        assertTrue(new ThreeOfAKindEvaluator().isMatch(hand));
    }

    @Test
    void isMatchNoThree() {
        List<Card> hand = Card.parseAll("AH 7H 6C 6D 5S");
        assertFalse(new ThreeOfAKindEvaluator().isMatch(hand));
    }
}
