package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * CategoryEvaluator for the 'two pair' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#TWO_PAIRS
 */
public class TwoPairEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Value, List<Card>> pairedCardsMap = hand.stream().collect(Collectors.groupingBy(Card::getValue));
        List<List<Card>> pairedCards = new ArrayList<>(pairedCardsMap.values());

        Stream<List<Card>> filter = pairedCards.stream().filter(cards -> cards.size() == 2);
        return filter.count() == 2;
    }
}
