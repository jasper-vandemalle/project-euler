package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Testing the TwoPairEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.TwoPairEvaluator
 */
public class TwoPairEvaluatorTest {
    @Test
    public void testIsMatchTwoPair() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assert.assertTrue(new TwoPairEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoTwoPair() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("6C"), new Card("5D"), new Card("4S"));
        Assert.assertFalse(new TwoPairEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assert.assertEquals(new Card("7H"), new TwoPairEvaluator().getHighestCard(hand));
    }
}
