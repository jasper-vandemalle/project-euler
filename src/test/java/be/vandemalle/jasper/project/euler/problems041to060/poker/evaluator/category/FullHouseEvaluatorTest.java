package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the FullHouseEvaluator.
 *
 * @author Jasper Vandemalle
 * @see FullHouseEvaluator
 */
class FullHouseEvaluatorTest {
    @Test
    void isMatchFullHouse() {
        List<Card> hand = Card.parseAll("AH AC 6C 6D 6S");
        assertTrue(new FullHouseEvaluator().isMatch(hand));
    }

    @Test
    void isMatchNoFullHouse() {
        List<Card> hand = Card.parseAll("AH 6H 6C 6D 6S");
        assertFalse(new FullHouseEvaluator().isMatch(hand));
    }
}
