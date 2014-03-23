package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Testing the OnePairEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.OnePairEvaluator
 */
public class OnePairEvaluatorTest {
    @Test
    public void testIsMatchOnePair() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assert.assertTrue(new OnePairEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoOnePair() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("6C"), new Card("5D"), new Card("4S"));
        Assert.assertFalse(new OnePairEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assert.assertEquals(new Card("7H"), new OnePairEvaluator().getHighestCard(hand));
    }
}
