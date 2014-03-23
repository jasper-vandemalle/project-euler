package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

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
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("KH"), new Card("QH"), new Card("JH"), new Card("TH"));
        Assert.assertTrue(new RoyalFlushEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoRoyalFlush() {
        List<Card> hand = Lists.newArrayList(new Card("AC"), new Card("KH"), new Card("QH"), new Card("JH"), new Card("TH"));
        Assert.assertFalse(new RoyalFlushEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("KH"), new Card("QH"), new Card("JH"), new Card("TH"));
        Assert.assertEquals(new Card("AH"), new RoyalFlushEvaluator().getHighestCard(hand));
    }
}
