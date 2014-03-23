package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * CategoryEvaluator for the 'flush' category.
 *
 * @see CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#FLUSH
 */
public class FlushEvaluator implements CategoryEvaluator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatch(List<Card> hand) {
        Map<Suit, List<Card>> pairedCardsMap = hand.stream().collect(Collectors.groupingBy(Card::getSuit));
        List<List<Card>> pairedCards = new ArrayList<>(pairedCardsMap.values());

        Stream<List<Card>> filter = pairedCards.stream().filter(cards -> cards.size() == 5);
        return filter.count() > 0;
    }
}
