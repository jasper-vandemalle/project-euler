package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;

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
}
