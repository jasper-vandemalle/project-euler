package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Value, List<Card>> pairedCardsMap = hand.stream().collect(Collectors.groupingBy(Card::getValue));
        List<List<Card>> pairedCards = new ArrayList<>(pairedCardsMap.values());

        Stream<List<Card>> filter = pairedCards.stream().filter(cards -> cards.size() == getGroupByValue());
        return filter.count() > 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Card getHighestCard(List<Card> hand) {
        Map<Value, List<Card>> pairedCardsMap = hand.stream().collect(Collectors.groupingBy(Card::getValue));
        List<List<Card>> pairedCards = new ArrayList<>(pairedCardsMap.values());

        Stream<List<Card>> filter = pairedCards.stream().filter(cards -> cards.size() == getGroupByValue());
        return filter.max(
                (c1, c2) -> c1.get(0).compareTo(c2.get(0))
        ).get().get(0);
    }

    /**
     * Get the group by value.
     *
     * @return the group by value
     */
    public abstract int getGroupByValue();
}
