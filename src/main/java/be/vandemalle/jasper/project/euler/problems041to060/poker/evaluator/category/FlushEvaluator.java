package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import java.util.List;

/**
 * CategoryEvaluator for the 'flush' category.
 *
 * @see Category#FLUSH
 */
public class FlushEvaluator implements CategoryEvaluator {
    @Override
    public boolean isMatch(List<Card> hand) {
        return hand.stream().map(Card::suit).distinct().count() == 1;
    }
}
