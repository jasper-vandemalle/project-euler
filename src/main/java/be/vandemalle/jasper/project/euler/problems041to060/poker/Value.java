package be.vandemalle.jasper.project.euler.problems041to060.poker;

/**
 * Contains all values of a card.
 */
public enum Value {
    TWO('2'),
    THREE('3'),
    FOUR('4'),
    FIVE('5'),
    SIX('6'),
    SEVEN('7'),
    EIGHT('8'),
    NINE('9'),
    TEN('T'),
    JACK('J'),
    QUEEN('Q'),
    KING('K'),
    ACE('A');

    /**
     * The code character.
     */
    private final char code;

    /**
     * Instantiate the value.
     *
     * @param code the code character
     */
    private Value(char code) {
        this.code = code;
    }

    /**
     * Get the value by its code.
     *
     * @param code the code
     * @return the value
     */
    public static Value getByCode(char code) {
        for (Value v : Value.values()) {
            if (v.code == code) {
                return v;
            }
        }
        return null;
    }
}
