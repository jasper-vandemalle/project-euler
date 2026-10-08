package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HandEvaluatorTest {
    @ParameterizedTest(name = "{0} is {1}")
    @CsvSource({
        "KS QS 9H 8H 5D, HIGH_CARD",
        "KS QS 9H 5C 5D, ONE_PAIR",
        "9C 9D 5H 5S KD, TWO_PAIRS",
        "6H 6C 6D AS 2D, THREE_OF_A_KIND",
        "9C 8D 7H 6S 5D, STRAIGHT",
        "5C 4D 3H 2S AD, STRAIGHT",
        "AH 6H 5H 3H 2H, FLUSH",
        "TC TD TH 2S 2D, FULL_HOUSE",
        "6H 6C 6D 6S AD, FOUR_OF_A_KIND",
        "9H 8H 7H 6H 5H, STRAIGHT_FLUSH",
        "5H 4H 3H 2H AH, STRAIGHT_FLUSH",
        "AH KH QH JH TH, ROYAL_FLUSH",
    })
    void categorizesHands(String hand, Category category) {
        assertEquals(category, new HandEvaluator(Card.parseAll(hand)).category());
    }

    @Test
    void higherCategoryWins() {
        assertWins("KS QS 9H 5C 5D", "KH QH 9S 8S 4D");
    }

    @Test
    void highCardsAreComparedFromHighToLow() {
        assertWins("KS QS 9H 8H 5D", "KH QH 9S 8S 4D");
    }

    @Test
    void identicalValuesTie() {
        assertTie("KS QS 9H 8H 5D", "KH QH 9S 8S 5C");
    }

    @Test
    void higherPairWinsRegardlessOfKickers() {
        assertWins("KS 9C 9H 7D 5D", "AH 8D 5D 5C 3S");
    }

    @Test
    void equalPairsAreSettledByKickers() {
        assertWins("9C 9H AD 4S 2C", "9D 9S KD QS JC");
    }

    @Test
    void equalHighPairsAreSettledByTheSecondPair() {
        assertWins("9H 9S 6C 6D 2H", "9C 9D 5H 5S KD");
    }

    @Test
    void equalTwoPairsAreSettledByTheKicker() {
        assertWins("9C 9D 5H 5S KD", "9H 9S 5C 5D QH");
    }

    @Test
    void fullHousesAreComparedOnTheirThreeOfAKind() {
        assertWins("TC TD TH 2S 2D", "9C 9D 9H AS AD");
    }

    @Test
    void aceLowStraightLosesToSixHighStraight() {
        assertWins("6C 5D 4H 3S 2D", "AC 5H 4D 3C 2S");
    }

    @Test
    void aceLowStraightBeatsThreeOfAKind() {
        assertWins("AC 5H 4D 3C 2S", "KC KD KH 3S 2D");
    }

    @Test
    void aceLowStraightsTie() {
        assertTie("AC 5H 4D 3C 2S", "AD 5C 4S 3D 2H");
    }

    private static void assertWins(String winner, String loser) {
        var winning = new HandEvaluator(Card.parseAll(winner));
        var losing = new HandEvaluator(Card.parseAll(loser));
        assertTrue(winning.compareTo(losing) > 0, winner + " should beat " + loser);
        assertTrue(losing.compareTo(winning) < 0, loser + " should lose to " + winner);
    }

    private static void assertTie(String hand, String other) {
        assertEquals(0, new HandEvaluator(Card.parseAll(hand)).compareTo(new HandEvaluator(Card.parseAll(other))));
    }
}
