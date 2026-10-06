package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Category;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FlushEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FourOfAKindEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.FullHouseEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.HighCardEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.OnePairEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.RoyalFlushEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.StraightEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.StraightFlushEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.ThreeOfAKindEvaluator;
import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.TwoPairEvaluator;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Evaluates a hand: its category, plus the values that break ties between hands of that category.
 */
public class HandEvaluator implements Comparable<HandEvaluator> {
    private static final Map<Category, CategoryEvaluator> EVALUATORS = new EnumMap<>(Map.of(
            Category.HIGH_CARD, new HighCardEvaluator(),
            Category.ONE_PAIR, new OnePairEvaluator(),
            Category.TWO_PAIRS, new TwoPairEvaluator(),
            Category.THREE_OF_A_KIND, new ThreeOfAKindEvaluator(),
            Category.STRAIGHT, new StraightEvaluator(),
            Category.FLUSH, new FlushEvaluator(),
            Category.FULL_HOUSE, new FullHouseEvaluator(),
            Category.FOUR_OF_A_KIND, new FourOfAKindEvaluator(),
            Category.STRAIGHT_FLUSH, new StraightFlushEvaluator(),
            Category.ROYAL_FLUSH, new RoyalFlushEvaluator()));

    private final Category category;

    private final List<Value> rankedValues;

    /**
     * Instantiate the hand evaluator.
     *
     * @param hand the hand that will be evaluated, in any order
     */
    public HandEvaluator(List<Card> hand) {
        List<Card> sortedHand = hand.stream().sorted(Card.BY_VALUE.reversed()).toList();

        category = Category.getCategoryHighToLow().stream()
                .filter(candidate -> EVALUATORS.get(candidate).isMatch(sortedHand))
                .findFirst()
                .orElseThrow();
        rankedValues = rankValues(sortedHand);
    }

    /**
     * The distinct values of a hand in tie-breaking order: values that occur more often come first (the three of a
     * kind in a full house before its pair, a pair before its kickers), then higher values before lower ones.
     */
    private static List<Value> rankValues(List<Card> hand) {
        Comparator<Map.Entry<Value, Long>> byCount = Map.Entry.comparingByValue();
        Comparator<Map.Entry<Value, Long>> byValue = Map.Entry.comparingByKey();

        return hand.stream().collect(groupingBy(Card::value, counting())).entrySet().stream()
                .sorted(byCount.thenComparing(byValue).reversed())
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * Get the hand's category.
     *
     * @return the highest category the hand matches
     */
    public Category category() {
        return category;
    }

    /**
     * Compare by category first; hands of the same category have the same shape, so their ranked values can then be
     * compared one by one.
     */
    @Override
    public int compareTo(HandEvaluator that) {
        int result = this.category.compareTo(that.category);
        for (int i = 0; result == 0 && i < rankedValues.size(); i++) {
            result = this.rankedValues.get(i).compareTo(that.rankedValues.get(i));
        }
        return result;
    }
}
