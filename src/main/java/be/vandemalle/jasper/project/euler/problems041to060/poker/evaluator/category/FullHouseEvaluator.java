package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;

import java.util.List;

/**
 * CategoryEvaluator for the 'full house' category.
 *
 * @see CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#FULL_HOUSE
 */
public class FullHouseEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        boolean onePair = new OnePairEvaluator().isMatch(hand);
        boolean threeOfAKind = new ThreeOfAKindEvaluator().isMatch(hand);
        return onePair && threeOfAKind;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Card getHighestCard(List<Card> hand) {
        return new ThreeOfAKindEvaluator().getHighestCard(hand);
    }
}
