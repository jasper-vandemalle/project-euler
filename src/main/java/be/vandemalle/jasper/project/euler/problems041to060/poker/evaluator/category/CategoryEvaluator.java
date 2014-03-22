package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;

import java.util.List;

/**
 * The category evaluator
 */
public interface CategoryEvaluator {
    /**
     * Check if a hand matches a certain category.
     *
     * @param hand the hand
     * @return <code>true</code> if the hand matches the category, <code>false</code> otherwise
     */
    boolean isMatch(List<Card> hand);

    /**
     * Gets the highest value, in case of a draw.
     *
     * @return the highest value
     */
    default Value getHighestValue(List<Card> hand) {
        return new HighCardEvaluator().getHighestValue(hand);
    }
}
