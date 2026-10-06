package be.vandemalle.jasper.project.euler.problems041to060.poker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CardTest {
    @Test
    void parsesValueAndSuit() {
        assertEquals(new Card(Value.TEN, Suit.SPADES), Card.parse("TS"));
        assertEquals(new Card(Value.FOUR, Suit.HEARTS), Card.parse("4H"));
    }

    @Test
    void parsesSpaceSeparatedCards() {
        assertEquals(
                List.of(new Card(Value.EIGHT, Suit.CLUBS), new Card(Value.ACE, Suit.DIAMONDS)), Card.parseAll("8C AD"));
    }

    @Test
    void cardsWithTheSameValueButDifferentSuitsAreNotEqual() {
        assertEquals(0, Card.BY_VALUE.compare(Card.parse("5C"), Card.parse("5D")));
        assertNotEquals(Card.parse("5C"), Card.parse("5D"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "A", "1H", "AX", "10H"})
    void rejectsInvalidCodes(String code) {
        assertThrows(IllegalArgumentException.class, () -> Card.parse(code));
    }
}
