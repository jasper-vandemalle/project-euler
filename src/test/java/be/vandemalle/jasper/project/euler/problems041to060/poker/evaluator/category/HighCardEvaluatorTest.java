package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Testing the HighCardEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.HighCardEvaluator
 */
public class HighCardEvaluatorTest {
    @Test
    public void testIsMatchHighCard() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assert.assertTrue(new HighCardEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Lists.newArrayList(new Card("AH"), new Card("7H"), new Card("7C"), new Card("6D"), new Card("6S"));
        Assert.assertEquals(new Card("AH"), new HighCardEvaluator().getHighestCard(hand));
    }
}
