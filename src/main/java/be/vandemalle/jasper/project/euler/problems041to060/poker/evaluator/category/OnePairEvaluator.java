package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;

/**
 * CategoryEvaluator for the 'one pair' category.
 *
 * @see Category#ONE_PAIR
 */
public class OnePairEvaluator extends AbstractGroupedValuesEvaluator {
    @Override
    public int getGroupByValue() {
        return 2;
    }
}
