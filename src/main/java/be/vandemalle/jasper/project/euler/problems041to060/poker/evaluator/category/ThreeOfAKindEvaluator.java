package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * CategoryEvaluator for the 'three of a kind' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#THREE_OF_A_KIND
 */
public class ThreeOfAKindEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Value, List<Card>> pairedCardsMap = hand.stream().collect(Collectors.groupingBy(Card::getValue));
        List<List<Card>> pairedCards = new ArrayList<>(pairedCardsMap.values());

        Stream<List<Card>> filter = pairedCards.stream().filter(cards -> cards.size() == 3);
        return filter.count() > 0;
    }
}
