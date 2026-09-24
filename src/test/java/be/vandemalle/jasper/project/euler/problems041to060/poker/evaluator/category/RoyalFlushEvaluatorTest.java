package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Testing the RoyalFlushEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.RoyalFlushEvaluator
 */
public class RoyalFlushEvaluatorTest {
    @Test
    public void testIsMatchRoyalFlush() {
        List<Card> hand = List.of(new Card("AH"), new Card("KH"), new Card("QH"), new Card("JH"), new Card("TH"));
        Assertions.assertTrue(new RoyalFlushEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoRoyalFlush() {
        List<Card> hand = List.of(new Card("AC"), new Card("KH"), new Card("QH"), new Card("JH"), new Card("TH"));
        Assertions.assertFalse(new RoyalFlushEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = List.of(new Card("AH"), new Card("KH"), new Card("QH"), new Card("JH"), new Card("TH"));
        Assertions.assertEquals(new Card("AH"), new RoyalFlushEvaluator().getHighestCard(hand));
    }
}
