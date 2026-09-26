package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the FlushEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FlushEvaluator
 */
public class FlushEvaluatorTest {
    @Test
    public void testIsMatchFullSuit() {
        List<Card> hand = List.of(new Card("AH"), new Card("6H"), new Card("5H"), new Card("3H"), new Card("2H"));
        Assertions.assertTrue(new FlushEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFullSuit() {
        List<Card> hand = List.of(new Card("AC"), new Card("6H"), new Card("5H"), new Card("3H"), new Card("2H"));
        Assertions.assertFalse(new FlushEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("6H"), new Card("5H"), new Card("3H"), new Card("2H"));
        Assertions.assertEquals(new Card("AH"), new FlushEvaluator().getHighestCard(hand));
    }
}
