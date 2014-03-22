package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;

import java.util.List;

/**
 * CategoryEvaluator for the 'high card' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#HIGH_CARD
 */
public class HighCardEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Value getHighestValue(List<Card> hand) {
        Value highestValue = null;

        for (Card card : hand) {
            if (highestValue == null || card.getValue().compareTo(highestValue) > 0) {
                highestValue = card.getValue();
            }
        }

        return highestValue;
    }
}
