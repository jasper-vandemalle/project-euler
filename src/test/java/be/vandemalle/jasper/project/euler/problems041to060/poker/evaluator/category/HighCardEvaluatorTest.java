package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testing the HighCardEvaluator.
 *
 * @author Jasper Vandemalle
 * @see HighCardEvaluator
 */
class HighCardEvaluatorTest {
    @Test
    void isMatchHighCard() {
        List<Card> hand = Card.parseAll("AH 7H 7C 6D 6S");
        assertTrue(new HighCardEvaluator().isMatch(hand));
    }
}
