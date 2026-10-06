package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Testing the HandEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.HandEvaluator
 */
public class HandEvaluatorTest {
    @Test
    public void testCompareOnePairOverHighCard() {
        // Player 1: KING of SPADES, QUEEN of SPADES, NINE of HEARTS, FIVE of CLUBS, FIVE of DIAMONDS (ONE_PAIR, FIVE of
        // CLUBS)
        List<Card> player1Hand = Card.parseAll("KS QS 9H 5C 5D");
        // Player 1: KING of HEARTS, QUEEN of HEARTS, NINE of SPADES, EIGHT of SPADES, FOUR of DIAMONDS (HIGH_PAIR, KING
        // of SPADES)
        List<Card> player2Hand = Card.parseAll("KH QH 9S 8S 4D");

        // Player 1 wins!
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assertions.assertTrue(comparison > 0);
    }

    @Test
    public void testCompareHighCard() {
        // Player 1: KING of SPADES, QUEEN of SPADES, NINE of HEARTS, EIGHT of HEARTS, FIVE of DIAMONDS (HIGH_CARD, KING
        // of SPADES -> FIVE of DIAMONDS)
        List<Card> player1Hand = Card.parseAll("KS QS 9H 8H 5D");
        // Player 1: KING of HEARTS, QUEEN of HEARTS, NINE of SPADES, EIGHT of SPADES, FOUR of DIAMONDS (HIGH_CARD, KING
        // of HEARTS -> FOUR of DIAMONDS)
        List<Card> player2Hand = Card.parseAll("KH QH 9S 8S 4D");

        // Player 1 wins!
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assertions.assertTrue(comparison > 0);
    }

    @Test
    public void testCompareHighCardEqual() {
        // Player 1: KING of SPADES, QUEEN of SPADES, NINE of HEARTS, EIGHT of HEARTS, FIVE of DIAMONDS (HIGH_CARD, KING
        // of SPADES -> FIVE of DIAMONDS)
        List<Card> player1Hand = Card.parseAll("KS QS 9H 8H 5D");
        // Player 1: KING of HEARTS, QUEEN of HEARTS, NINE of SPADES, EIGHT of SPADES, FIVE of CLUBS (HIGH_CARD, KING of
        // HEARTS -> FIVE of CLUBS)
        List<Card> player2Hand = Card.parseAll("KH QH 9S 8S 5C");

        // Draw
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assertions.assertTrue(comparison == 0);
    }

    @Test
    public void testCompareOnePair() {
        // Player 1: KING of SPADES, NINE of CLUBS, NINE of HEARTS, SEVEN of DIAMONDS, FIVE of HEARTS (ONE_PAIR, NINE of
        // CLUBS)
        List<Card> player1Hand = Card.parseAll("KS 9C 9H 7D 5D");
        // Player 2: ACE of HEARTS, EIGHT of DIAMONDS, FIVE of DIAMONDS, FIVE of CLUBS, THREE of SPADES (ONE_PAIR, FIVE
        // of DIAMONDS)
        List<Card> player2Hand = Card.parseAll("AH 8D 5D 5C 3S");

        // PLayer 1 wins!
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assertions.assertTrue(comparison > 0);
    }
}
