package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;

import java.util.List;
import java.util.stream.Stream;

/**
 * CategoryEvaluator for the 'royal flush' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#ROYAL_FLUSH
 */
public class RoyalFlushEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        Stream<Card> filter = hand.stream().filter(card -> card.getValue() == Value.ACE);
        boolean ace = filter.count() > 0;
        boolean straightFlush = new StraightFlushEvaluator().isMatch(hand);
        return ace && straightFlush;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Card getHighestCard(List<Card> hand) {
        return hand.get(0);
    }
}
