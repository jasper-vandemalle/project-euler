package be.vandemalle.jasper.project.euler.problems041to060;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Game;
import be.vandemalle.jasper.project.euler.utils.Resources;
import java.util.Arrays;
import java.util.List;

/**
 * Poker hands.
 *
 * @author Jasper Vandemalle
 * @see <a href="https://projecteuler.net/problem=54">Project Euler problem 54</a>
 */
public class Problem054 implements Solvable {
    @Override
    public String solve() {
        List<Game> games = readGames();
        int player1HandsWon = 0;

        for (Game game : games) {
            game.play();

            if (game.isPlayer1Winner()) {
                player1HandsWon++;
            }
        }

        return Integer.toString(player1HandsWon);
    }

    private static List<Game> readGames() {
        return Resources.readLines(Problem054.class, "Problem054-poker.txt").stream()
                .map(Problem054::parseGame)
                .toList();
    }

    /**
     * Parse a line such as {@code 8C TS KC 9H 4S 7D 2S 5D 3S AC}: ten cards, of which the first five belong to
     * player 1 and the last five to player 2.
     */
    private static Game parseGame(String line) {
        List<Card> cards = Arrays.stream(line.split(" ")).map(Card::new).toList();
        return new Game(cards.subList(0, 5), cards.subList(5, 10));
    }
}
