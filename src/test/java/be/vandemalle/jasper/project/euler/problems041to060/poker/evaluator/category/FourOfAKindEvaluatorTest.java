package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the FourOfAKindEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FourOfAKindEvaluator
 */
public class FourOfAKindEvaluatorTest {
    @Test
    public void testIsMatchFour() {
        List<Card> hand = List.of(new Card("AH"), new Card("6H"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertTrue(new FourOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFour() {
        List<Card> hand = List.of(new Card("AH"), new Card("7H"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertFalse(new FourOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("6H"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertEquals(new Card("6H"), new FourOfAKindEvaluator().getHighestCard(hand));
    }
}
