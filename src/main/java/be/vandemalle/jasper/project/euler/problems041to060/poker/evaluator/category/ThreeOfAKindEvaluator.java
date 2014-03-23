package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

/**
 * CategoryEvaluator for the 'three of a kind' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#THREE_OF_A_KIND
 */
public class ThreeOfAKindEvaluator extends AbstractGroupedValuesEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getGroupByValue() {
        return 3;
    }
}
