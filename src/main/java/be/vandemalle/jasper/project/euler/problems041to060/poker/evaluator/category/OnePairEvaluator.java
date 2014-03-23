package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

/**
 * CategoryEvaluator for the 'one pair' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#ONE_PAIR
 */
public class OnePairEvaluator extends AbstractGroupedValuesEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getGroupByValue() {
        return 2;
    }
}
