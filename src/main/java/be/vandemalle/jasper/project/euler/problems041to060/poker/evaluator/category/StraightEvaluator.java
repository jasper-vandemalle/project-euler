package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;

import java.util.List;

/**
 * CategoryEvaluator for the 'straight' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#STRAIGHT
 */
public class StraightEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        boolean straight = true;

        // hand is sorted from high to low
        for (int i = 0; i < hand.size() - 1; i++) {
            Card card = hand.get(i);
            Card nextCard = hand.get(i + 1);

            // the value ordinal should be exactly one higher
            if (card.getValue().ordinal() != nextCard.getValue().ordinal() + 1) {
                straight = false;
                break;
            }
        }

        return straight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Card getHighestCard(List<Card> hand) {
        return hand.get(0);
    }
}
