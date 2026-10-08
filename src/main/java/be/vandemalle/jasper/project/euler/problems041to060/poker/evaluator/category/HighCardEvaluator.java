package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import java.util.List;

/**
 * CategoryEvaluator for the 'high card' category.
 *
 * @see Category#HIGH_CARD
 */
public class HighCardEvaluator implements CategoryEvaluator {
    @Override
    public boolean isMatch(List<Card> hand) {
        return true;
    }
}
