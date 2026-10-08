package be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category;

import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Value;
import java.util.List;

/**
 * CategoryEvaluator for the 'straight' category.
 *
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.category.CategoryEvaluator
 * @see be.vandemalle.jasper.project.euler.problems041to060.poker.Category#STRAIGHT
 */
public class StraightEvaluator implements CategoryEvaluator {
    /**
     * The values of the lowest straight, A-2-3-4-5, sorted from high to low with the ace counting high.
     */
    private static final List<Value> WHEEL = List.of(Value.ACE, Value.FIVE, Value.FOUR, Value.THREE, Value.TWO);

    @Override
    public boolean isMatch(List<Card> hand) {
        // hand is sorted from high to low
        for (int i = 0; i < hand.size() - 1; i++) {
            // the value ordinal should be exactly one higher
            if (hand.get(i).value().ordinal() != hand.get(i + 1).value().ordinal() + 1) {
                return isWheel(hand);
            }
        }

        return true;
    }

    /**
     * Check for the straight where the ace counts low: A-2-3-4-5.
     *
     * @param hand the hand (sorted)
     * @return {@code true} if the hand is an ace-low straight, {@code false} otherwise
     */
    public static boolean isWheel(List<Card> hand) {
        return hand.stream().map(Card::value).toList().equals(WHEEL);
    }
}
