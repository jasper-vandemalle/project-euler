package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import java.util.List;

/**
 * CategoryEvaluator for the 'two pair' category.
 *
 * @see Category#TWO_PAIRS
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
