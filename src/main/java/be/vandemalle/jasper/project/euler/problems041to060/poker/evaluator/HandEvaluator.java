package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.*;
import com.google.common.collect.ComparisonChain;

import java.util.*;

/**
 * HandEvaluator evaluates a hand and determines the category and high card.
 */
public class HandEvaluator implements Comparable<HandEvaluator> {
    /**
     * A map of category evaluators.
     */
    private final Map<Category, CategoryEvaluator> categoryEvaluatorMap = new HashMap<>();

    /**
     * The highest category for the hand.
     */
    private Category highestCategory;

    /**
     * The cards of the hand sorted from high to low.
     */
    private List<Card> highestCards;

    /**
     * Instantiate the hand evaluator.
     *
     * @param hand the hand that will be evaluated
     */
    public HandEvaluator(List<Card> hand) {
        initMap();
        findBest(hand);
        sortHand(hand);
    }

    /**
     * Initialize a map of category evaluators.
     */
    private void initMap() {
        categoryEvaluatorMap.put(Category.FLUSH, new FlushEvaluator());
        categoryEvaluatorMap.put(Category.FOUR_OF_A_KIND, new FourOfAKindEvaluator());
        categoryEvaluatorMap.put(Category.FULL_HOUSE, new FullHouseEvaluator());
        categoryEvaluatorMap.put(Category.HIGH_CARD, new HighCardEvaluator());
        categoryEvaluatorMap.put(Category.ONE_PAIR, new OnePairEvaluator());
        categoryEvaluatorMap.put(Category.ROYAL_FLUSH, new RoyalFlushEvaluator());
        categoryEvaluatorMap.put(Category.STRAIGHT, new StraightEvaluator());
        categoryEvaluatorMap.put(Category.STRAIGHT_FLUSH, new StraightFlushEvaluator());
        categoryEvaluatorMap.put(Category.THREE_OF_A_KIND, new ThreeOfAKindEvaluator());
        categoryEvaluatorMap.put(Category.TWO_PAIRS, new TwoPairEvaluator());
    }

    /**
     * Find the best hand category and high value.
     *
     * @param hand the hand
     */
    private void findBest(List<Card> hand) {
        for (Category category : Category.getCategoryHighToLow()) {
            CategoryEvaluator evaluator = categoryEvaluatorMap.get(category);

            if (evaluator.isMatch(hand)) {
                highestCategory = category;
                break;
            }
        }
    }

    /**
     * Sort the hand.
     *
     * @param hand the hand
     */
    private void sortHand(List<Card> hand) {
        Collections.sort(hand, Comparator.<Card>naturalOrder().reversed());
        highestCards = hand;
    }

    /**
     * Get the highest category.
     *
     * @return the highest category
     */
    public Category getHighestCategory() {
        return highestCategory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(HandEvaluator that) {
        ComparisonChain chain = ComparisonChain.start().compare(this.highestCategory, that.highestCategory);
        for (int i = 0; i < highestCards.size(); i++) {
            chain.compare(this.highestCards.get(i), that.highestCards.get(i));
        }
        return chain.result();
    }
}
