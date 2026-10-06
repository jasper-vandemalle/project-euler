package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the HighCardEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.HighCardEvaluator
 */
public class HighCardEvaluatorTest {
    @Test
    public void testIsMatchHighCard() {
        List<Card> hand = Card.parseAll("AH 7H 7C 6D 6S");
        Assertions.assertTrue(new HighCardEvaluator().isMatch(hand));
    }
}
