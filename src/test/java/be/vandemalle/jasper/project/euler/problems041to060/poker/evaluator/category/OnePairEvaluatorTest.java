package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the OnePairEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.OnePairEvaluator
 */
public class OnePairEvaluatorTest {
    @Test
    public void testIsMatchOnePair() {
        List<Card> hand = Card.parseAll("AH 7H 7C 6D 6S");
        Assertions.assertTrue(new OnePairEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoOnePair() {
        List<Card> hand = Card.parseAll("AH 7H 6C 5D 4S");
        Assertions.assertFalse(new OnePairEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Card.parseAll("AH 7H 7C 6D 6S");
        Assertions.assertEquals(
                Card.parse("7H").value(),
                new OnePairEvaluator().getHighestCard(hand).value());
    }
}
