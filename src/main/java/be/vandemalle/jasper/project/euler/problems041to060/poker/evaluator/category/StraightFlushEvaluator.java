package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;

import java.util.List;

/**
 * CategoryEvaluator for the 'straight flush' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#STRAIGHT_FLUSH
 */
public class StraightFlushEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        boolean straight = new StraightEvaluator().isMatch(hand);
        boolean flush = new FlushEvaluator().isMatch(hand);
        return straight && flush;
    }
}
