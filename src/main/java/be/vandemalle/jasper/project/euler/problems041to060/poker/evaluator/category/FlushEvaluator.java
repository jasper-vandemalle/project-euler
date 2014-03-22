package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;

import java.util.List;

/**
 * CategoryEvaluator for the 'flush' category.
 *
 * @see CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#FLUSH
 */
public class FlushEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        return false;
    }
}
