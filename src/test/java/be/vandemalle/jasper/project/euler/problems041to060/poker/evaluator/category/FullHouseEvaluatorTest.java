package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Testing the FullHouseEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FullHouseEvaluator
 */
public class FullHouseEvaluatorTest {
    @Test
    public void testIsMatchFullHouse() {
        List<Card> hand = List.of(new Card("AH"), new Card("AC"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertTrue(new FullHouseEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFullHouse() {
        List<Card> hand = List.of(new Card("AH"), new Card("6H"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertFalse(new FullHouseEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("AC"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assertions.assertEquals(new Card("6C"), new FullHouseEvaluator().getHighestCard(hand));
    }
}
