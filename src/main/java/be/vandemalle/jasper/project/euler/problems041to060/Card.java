package be.vandemalle.jasper.project.euler.problems041to060;

/**
 * The card, containing a suit and value.
 */
public class Card {
    /**
     * The suit.
     */
    private Suit suit;

    /**
     * The value.
     */
    private Value value;

    /**
     * Create a card by its code.
     *
     * @param cardCode the card code
     */
    public Card(String cardCode) {
        suit = Suit.getByCode(cardCode.charAt(1));
        value = Value.getByCode(cardCode.charAt(0));
    }

    /**
     * Create a card.
     *
     * @param suit  the suit
     * @param value the value
     */
    private Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Get the suit.
     *
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get the value.
     *
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value.name());
        sb.append(" of ");
        sb.append(suit.name());
        return sb.toString();
    }
}
