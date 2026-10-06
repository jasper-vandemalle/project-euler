package be.vandemalle.jasper.project.euler.problems041to060.poker;

/**
 * Contains all suits in a card deck.
 */
public enum Suit {
    HEARTS('H'),
    DIAMONDS('D'),
    CLUBS('C'),
    SPADES('S');

    /**
     * The code character.
     */
    private final char code;

    /**
     * Instantiate the suit.
     *
     * @param code the code character
     */
    Suit(char code) {
        this.code = code;
    }

    /**
     * Get the suit by its code.
     *
     * @param code the code
     * @return the suit
     * @throws IllegalArgumentException if no suit has this code
     */
    public static Suit fromCode(char code) {
        for (Suit s : values()) {
            if (s.code == code) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown suit code: " + code);
    }
}
