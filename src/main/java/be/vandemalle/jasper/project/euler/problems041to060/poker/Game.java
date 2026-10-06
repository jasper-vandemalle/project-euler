package be.vandemalle.jasper.project.euler.problems041to060.poker;

import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.HandEvaluator;
import java.util.List;

/**
 * A poker game between two players.
 *
 * @param player1Hand the hand for player 1
 * @param player2Hand the hand for player 2
 */
public record Game(List<Card> player1Hand, List<Card> player2Hand) {
    /**
     * Check if player 1 wins the game.
     *
     * @return {@code true} if player 1 has the better hand, {@code false} on a loss or a tie
     */
    public boolean player1Wins() {
        return new HandEvaluator(player1Hand).compareTo(new HandEvaluator(player2Hand)) > 0;
    }
}
