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
    Value(char code) {
        this.code = code;
    }

    /**
     * Get the value by its code.
     *
     * @param code the code
     * @return the value
     * @throws IllegalArgumentException if no value has this code
     */
    public static Value fromCode(char code) {
        for (Value v : values()) {
            if (v.code == code) {
                return v;
            }
        }
        throw new IllegalArgumentException("Unknown value code: " + code);
    }
}
