package be.vandemalle.jasper.project.euler.problems041to060;

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
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player 1: ");
        sb.append(toString(player1Hand));
        sb.append(SystemUtils.LINE_SEPARATOR);
        sb.append("Player 2: ");
        sb.append(toString(player2Hand));
        return sb.toString();
    }

    /**
     * Create printable string for a hand of cards.
     *
     * @param hand the hand of cards
     * @return a printable string
     */
    private String toString(List<Card> hand) {
        return hand.stream().map(card -> card.toString()).collect(Collectors.joining(", "));
    }
}
