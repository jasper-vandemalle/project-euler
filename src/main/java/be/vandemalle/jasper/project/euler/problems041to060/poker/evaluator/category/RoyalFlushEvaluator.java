package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;
import java.util.List;

/**
 * CategoryEvaluator for the 'royal flush' category.
 *
 * @see Category#ROYAL_FLUSH
 */
public class RoyalFlushEvaluator implements CategoryEvaluator {
    @Override
    public boolean isMatch(List<Card> hand) {
        // checking for the ace alone would also match the ace-low straight flush, so look at the lowest card
        boolean lowestCardIsTen = hand.getLast().value() == Value.TEN;
        return lowestCardIsTen && new StraightFlushEvaluator().isMatch(hand);
    }
}
