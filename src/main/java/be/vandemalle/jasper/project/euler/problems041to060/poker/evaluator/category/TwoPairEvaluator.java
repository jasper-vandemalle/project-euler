package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;

/**
 * CategoryEvaluator for the 'two pair' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#TWO_PAIRS
 */
public class TwoPairEvaluator extends AbstractGroupedValuesEvaluator {
    @Override
    public boolean isMatch(List<Card> hand) {
        return countGroups(hand) == 2;
    }

    @Override
    public int getGroupByValue() {
        return 2;
    }
}
