package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the HighCardEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.HighCardEvaluator
 */
public class HighCardEvaluatorTest {
    @Test
    public void testIsMatchHighCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assertions.assertTrue(new HighCardEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assertions.assertEquals(new Card("AH"), new HighCardEvaluator().getHighestCard(hand));
    }
}
