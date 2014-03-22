package be.vandemalle.jasper.project.euler.problems041to060.poker;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * An enum to categorize hands by their weight/order.
 */
public enum Category {
    /**
     * High Card: Highest value card.
     */
    HIGH_CARD,
    /**
     * One Pair: Two cards of the same value.
     */
    ONE_PAIR,
    /**
     * Two Pairs: Two different pairs.
     */
    TWO_PAIRS,
    /**
     * Three of a Kind: Three cards of the same value.
     */
    THREE_OF_A_KIND,
    /**
     * Straight: All cards are consecutive values.
     */
    STRAIGHT,
    /**
     * Flush: All cards of the same suit.
     */
    FLUSH,
    /**
     * Full House: Three of a kind and a pair.
     */
    FULL_HOUSE,
    /**
     * Four of a Kind: Four cards of the same value.
     */
    FOUR_OF_A_KIND,
    /**
     * Straight Flush: All cards are consecutive values of same suit.
     */
    STRAIGHT_FLUSH,
    /**
     * Royal Flush: Ten, Jack, Queen, King, Ace, in same suit.
     */
    ROYAL_FLUSH;

    /**
     * Gets a list of categories from highest to lowest value.
     * (uses the enum order)
     *
     * @return the categories
     */
    public static List<Category> getCategoryHighToLow() {
        return Lists.reverse(Arrays.asList(Category.values()));
    }
}
