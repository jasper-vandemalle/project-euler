package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the FourOfAKindEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FourOfAKindEvaluator
 */
public class FourOfAKindEvaluatorTest {
    @Test
    public void testIsMatchFour() {
        List<Card> hand = Card.parseAll("AH 6H 6C 6D 6S");
        Assertions.assertTrue(new FourOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFour() {
        List<Card> hand = Card.parseAll("AH 7H 6C 6D 6S");
        Assertions.assertFalse(new FourOfAKindEvaluator().isMatch(hand));
    }

    @Test
    public void testGetHighestCard() {
        List<Card> hand = Card.parseAll("AH 6H 6C 6D 6S");
        Assertions.assertEquals(
                Card.parse("6H").value(),
                new FourOfAKindEvaluator().getHighestCard(hand).value());
    }
}
