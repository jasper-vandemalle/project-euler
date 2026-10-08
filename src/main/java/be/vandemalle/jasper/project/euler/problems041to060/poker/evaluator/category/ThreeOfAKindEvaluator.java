package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;

/**
 * CategoryEvaluator for the 'three of a kind' category.
 *
 * @see Category#THREE_OF_A_KIND
 */
public class ThreeOfAKindEvaluator extends AbstractGroupedValuesEvaluator {
    @Override
    public int getGroupByValue() {
        return 3;
    }
}
