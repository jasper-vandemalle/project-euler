package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

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
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("AC"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assert.assertTrue(new FullHouseEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFullHouse() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("6H"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assert.assertFalse(new FullHouseEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("AC"), new Card("6C"), new Card("6D"), new Card("6S"));
        Assert.assertEquals(new Card("6C"), new FullHouseEvaluator().getHighestCard(hand));
    }
}
