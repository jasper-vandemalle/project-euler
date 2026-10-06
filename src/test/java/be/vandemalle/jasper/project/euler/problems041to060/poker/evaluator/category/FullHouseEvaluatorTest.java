package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the FullHouseEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FullHouseEvaluator
 */
public class FullHouseEvaluatorTest {
    @Test
    public void testIsMatchFullHouse() {
        List<Card> hand = Card.parseAll("AH AC 6C 6D 6S");
        Assertions.assertTrue(new FullHouseEvaluator().isMatch(hand));
    }

    @Test
    public void testIsMatchNoFullHouse() {
        List<Card> hand = Card.parseAll("AH 6H 6C 6D 6S");
        Assertions.assertFalse(new FullHouseEvaluator().isMatch(hand));
    }
}
