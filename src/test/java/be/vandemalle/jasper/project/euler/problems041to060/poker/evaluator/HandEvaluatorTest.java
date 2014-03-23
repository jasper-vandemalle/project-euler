package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Testing the HandEvaluator.
 *
 * @author Jasper Vandemalle
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.HandEvaluator
 */
public class HandEvaluatorTest {
    @Test
    public void testCompareOnePairOverHighCard() {
        //Player 1: KING of SPADES, QUEEN of SPADES, NINE of HEARTS, FIVE of CLUBS, FIVE of DIAMONDS (ONE_PAIR, FIVE of CLUBS)
        List<Card> player1Hand = Lists.newArrayList(new Card("KS"), new Card("QS"), new Card("9H"), new Card("5C"), new Card("5D"));
        //Player 1: KING of HEARTS, QUEEN of HEARTS, NINE of SPADES, EIGHT of SPADES, FOUR of DIAMONDS (HIGH_PAIR, KING of SPADES)
        List<Card> player2Hand = Lists.newArrayList(new Card("KH"), new Card("QH"), new Card("9S"), new Card("8S"), new Card("4D"));

        // Player 1 wins!
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assert.assertTrue(comparison > 0);
    }

    @Test
    public void testCompareHighCard() {
        //Player 1: KING of SPADES, QUEEN of SPADES, NINE of HEARTS, EIGHT of HEARTS, FIVE of DIAMONDS (HIGH_CARD, KING of SPADES -> FIVE of DIAMONDS)
        List<Card> player1Hand = Lists.newArrayList(new Card("KS"), new Card("QS"), new Card("9H"), new Card("8H"), new Card("5D"));
        //Player 1: KING of HEARTS, QUEEN of HEARTS, NINE of SPADES, EIGHT of SPADES, FOUR of DIAMONDS (HIGH_CARD, KING of HEARTS -> FOUR of DIAMONDS)
        List<Card> player2Hand = Lists.newArrayList(new Card("KH"), new Card("QH"), new Card("9S"), new Card("8S"), new Card("4D"));

        // Player 1 wins!
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assert.assertTrue(comparison > 0);
    }

    @Test
    public void testCompareHighCardEqual() {
        //Player 1: KING of SPADES, QUEEN of SPADES, NINE of HEARTS, EIGHT of HEARTS, FIVE of DIAMONDS (HIGH_CARD, KING of SPADES -> FIVE of DIAMONDS)
        List<Card> player1Hand = Lists.newArrayList(new Card("KS"), new Card("QS"), new Card("9H"), new Card("8H"), new Card("5D"));
        //Player 1: KING of HEARTS, QUEEN of HEARTS, NINE of SPADES, EIGHT of SPADES, FIVE of CLUBS (HIGH_CARD, KING of HEARTS -> FIVE of CLUBS)
        List<Card> player2Hand = Lists.newArrayList(new Card("KH"), new Card("QH"), new Card("9S"), new Card("8S"), new Card("5C"));

        // Draw
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assert.assertTrue(comparison == 0);
    }

    @Test
    public void testCompareOnePair() {
        //Player 1: KING of SPADES, NINE of CLUBS, NINE of HEARTS, SEVEN of DIAMONDS, FIVE of HEARTS (ONE_PAIR, NINE of CLUBS)
        List<Card> player1Hand = Lists.newArrayList(new Card("KS"), new Card("9C"), new Card("9H"), new Card("7D"), new Card("5D"));
        //Player 2: ACE of HEARTS, EIGHT of DIAMONDS, FIVE of DIAMONDS, FIVE of CLUBS, THREE of SPADES (ONE_PAIR, FIVE of DIAMONDS)
        List<Card> player2Hand = Lists.newArrayList(new Card("AH"), new Card("8D"), new Card("5D"), new Card("5C"), new Card("3S"));

        // PLayer 1 wins!
        int comparison = new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand));
        Assert.assertTrue(comparison > 0);
    }
}
