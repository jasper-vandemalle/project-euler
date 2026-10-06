package be.vandemalle.jasper.project.euler.problems041to060.poker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * A playing card.
 *
 * @param value the value, which is all that matters when ranking hands
 * @param suit the suit
 */
public record Card(Value value, Suit suit) {
    /**
     * Orders cards by value only, ignoring the suit.
     */
    public static final Comparator<Card> BY_VALUE = Comparator.comparing(Card::value);

    /**
     * Parse a two-character card code such as {@code TS} (ten of spades) or {@code 4H} (four of hearts).
     *
     * @param code the card code
     * @return the card
     * @throws IllegalArgumentException if the code is not a valid card
     */
    public static Card parse(String code) {
        if (code.length() != 2) {
            throw new IllegalArgumentException("Not a card code: " + code);
        }
        return new Card(Value.fromCode(code.charAt(0)), Suit.fromCode(code.charAt(1)));
    }

    /**
     * Parse space-separated card codes, such as {@code 8C TS KC 9H 4S}.
     *
     * @param codes the card codes
     * @return the cards, in the given order
     */
    public static List<Card> parseAll(String codes) {
        return Arrays.stream(codes.trim().split(" ")).map(Card::parse).toList();
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
