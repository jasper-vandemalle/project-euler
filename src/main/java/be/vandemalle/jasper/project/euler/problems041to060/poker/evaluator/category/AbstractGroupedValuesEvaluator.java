package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import java.util.List;

/**
 * CategoryEvaluator for the categories that can be grouped by value.
 * (one pair, two pairs, three of a kind and four of a kind)
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#ONE_PAIR
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#TWO_PAIRS
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#THREE_OF_A_KIND
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#FOUR_OF_A_KIND
 */
public abstract class AbstractGroupedValuesEvaluator implements CategoryEvaluator {
    @Override
    public boolean isMatch(List<Card> hand) {
        return countGroups(hand) > 0;
    }

    /**
     * Count the values that occur exactly {@link #getGroupByValue()} times in the hand.
     *
     * @param hand the hand
     * @return the number of such groups
     */
    protected long countGroups(List<Card> hand) {
        return hand.stream().collect(groupingBy(Card::value, counting())).values().stream()
                .filter(count -> count == getGroupByValue())
                .count();
    }

    /**
     * Get the group by value.
     *
     * @return how many cards of the same value make up a group
     */
    public abstract int getGroupByValue();
}
