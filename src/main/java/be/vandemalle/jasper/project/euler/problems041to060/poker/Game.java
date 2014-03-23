package be.vandemalle.jasper.project.euler.problems041to060.poker;

import be.vandemalle.jasper.project.euler.problems041to060.poker.evaluator.HandEvaluator;
import org.apache.commons.lang3.SystemUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A poker game that contains hands for 2 players.
 */
public class Game {
    /**
     * The hand for player 1.
     */
    private List<Card> player1Hand;

    /**
     * The hand for player 2.
     */
    private List<Card> player2Hand;

    /**
     * The hand evaluator for player 1.
     */
    HandEvaluator player1HandEvaluator;

    /**
     * The hand evaluator for player 2.
     */
    HandEvaluator player2HandEvaluator;

    /**
     * Create a game with 2 hands.
     *
     * @param player1Hand the hand for player 1
     * @param player2Hand the hand for player 2
     */
    public Game(List<Card> player1Hand, List<Card> player2Hand) {
        this.player1Hand = player1Hand;
        this.player2Hand = player2Hand;
    }

    /**
     * Play both players hands.
     */
    public void play() {
        player1HandEvaluator = new HandEvaluator(player1Hand);
        player2HandEvaluator = new HandEvaluator(player2Hand);
    }

    /**
     * Check if player 1 wins the game.
     *
     * @return <code>true</code> if player 1 wins, <code>false</code> otherwise
     */
    public boolean isPlayer1Winner() {
        boolean player1Wins = false;

        if (player1HandEvaluator.compareTo(player2HandEvaluator) > 0) {
            player1Wins = true;
        }

        return player1Wins;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player 1: ");
        sb.append(toString(player1Hand));
        sb.append(" (" + player1HandEvaluator.getHighestCategory() + ", ");
        sb.append(player1HandEvaluator.getHighestCardInCategory() + ")");
        sb.append(SystemUtils.LINE_SEPARATOR);
        sb.append("Player 2: ");
        sb.append(toString(player2Hand));
        sb.append(" (" + player2HandEvaluator.getHighestCategory() + ", ");
        sb.append(player2HandEvaluator.getHighestCardInCategory() + ")");
        sb.append(SystemUtils.LINE_SEPARATOR);
        sb.append(isPlayer1Winner() ? "Player 1 wins!" : "Player 2 wins!");
        return sb.toString();
    }

    /**
     * Create printable string for a hand of cards.
     *
     * @param hand the hand of cards
     * @return a printable string
     */
    private String toString(List<Card> hand) {
        return hand.stream().map(Card::toString).collect(Collectors.joining(", "));
    }
}
