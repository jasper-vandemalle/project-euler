package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Testing the ThreeOfAKindEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.ThreeOfAKindEvaluator
 */
public class ThreeOfAKindEvaluatorTest {
    @Test
    public void testIsMatchThree() {
        List<Card> hand = List.of(new Card("AH"), new Card("AC"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertTrue(new ThreeOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoThree() {
        List<Card> hand = List.of(new Card("AH"), new Card("7H"), new Card("6C"), new Card("6D"), new Card("5S"));
        Assertions.assertFalse(new ThreeOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("7H"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertEquals(new Card("6H"), new ThreeOfAKindEvaluator().getHighestCard(hand));
    }
}
