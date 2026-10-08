package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the FourOfAKindEvaluator.
 *
 * @author Jasper Vandemalle
 * @see FourOfAKindEvaluator
 */
class FourOfAKindEvaluatorTest {
    @Test
    void isMatchFour() {
        List<Card> hand = Card.parseAll("AH 6H 6C 6D 6S");
        assertTrue(new FourOfAKindEvaluator().isMatch(hand));
    }

    @Test
    void isMatchNoFour() {
        List<Card> hand = Card.parseAll("AH 7H 6C 6D 6S");
        assertFalse(new FourOfAKindEvaluator().isMatch(hand));
    }
}
