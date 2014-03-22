package be.vandemalle.jasper.project.euler.problems041to060;

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
    private char code;

    /**
     * Instantiate the suit.
     *
     * @param code the code character
     */
    private Suit(char code) {
        this.code = code;
    }

    /**
     * Get the suit by its code.
     *
     * @param code the code
     * @return the suit
     */
    public static Suit getByCode(char code) {
        for (Suit s : Suit.values()) {
            if (s.code == code) {
                return s;
            }
        }
        return null;
    }
}
