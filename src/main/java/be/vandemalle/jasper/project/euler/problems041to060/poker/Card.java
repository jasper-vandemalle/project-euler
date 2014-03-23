package be.vandemalle.jasper.project.euler.problems041to060.poker;

import com.google.common.collect.ComparisonChain;

/**
 * The card, containing a suit and value.
 */
public class Card implements Comparable<Card> {
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

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(Card that) {
        return ComparisonChain.start()
                .compare(this.value, that.value)
                .result();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
