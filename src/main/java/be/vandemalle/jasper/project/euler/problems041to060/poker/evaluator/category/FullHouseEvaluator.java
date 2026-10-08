package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import java.util.List;

/**
 * CategoryEvaluator for the 'full house' category.
 *
 * @see Category#FULL_HOUSE
 */
public class FullHouseEvaluator implements CategoryEvaluator {
    @Override
    public boolean isMatch(List<Card> hand) {
        boolean onePair = new OnePairEvaluator().isMatch(hand);
        boolean threeOfAKind = new ThreeOfAKindEvaluator().isMatch(hand);
        return onePair && threeOfAKind;
    }
}
