package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

/**
 * CategoryEvaluator for the 'four of a kind' category.
 *
 * @see CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#FOUR_OF_A_KIND
 */
public class FourOfAKindEvaluator extends AbstractGroupedValuesEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getGroupByValue() {
        return 4;
    }
}
