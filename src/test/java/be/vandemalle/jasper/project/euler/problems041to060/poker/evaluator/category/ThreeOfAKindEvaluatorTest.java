package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the ThreeOfAKindEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.ThreeOfAKindEvaluator
 */
public class ThreeOfAKindEvaluatorTest {
    @Test
    public void testIsMatchThree() {
        List<Card> hand = Card.parseAll("AH AC 6C 6D 6S");
        Assertions.assertTrue(new ThreeOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoThree() {
        List<Card> hand = Card.parseAll("AH 7H 6C 6D 5S");
        Assertions.assertFalse(new ThreeOfAKindEvaluator().isMatch(hand));
    }
}
