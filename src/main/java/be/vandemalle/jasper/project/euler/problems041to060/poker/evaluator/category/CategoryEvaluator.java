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
     * @param hand the hand (sorted)
     * @return {@code true} if the hand matches the category, {@code false} otherwise
     */
    boolean isMatch(List<Card> hand);
}
