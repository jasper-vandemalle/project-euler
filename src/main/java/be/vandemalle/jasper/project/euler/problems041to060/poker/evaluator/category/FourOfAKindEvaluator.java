package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;

/**
 * CategoryEvaluator for the 'four of a kind' category.
 *
 * @see Category#FOUR_OF_A_KIND
 */
public class FourOfAKindEvaluator extends AbstractGroupedValuesEvaluator {
    @Override
    public int getGroupByValue() {
        return 4;
    }
}
