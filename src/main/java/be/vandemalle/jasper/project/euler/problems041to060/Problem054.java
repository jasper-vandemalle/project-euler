package be.vandemalle.jasper.project.euler.problems041to060;

import be.vandemalle.jasper.project.euler.Solvable;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Game;
import be.vandemalle.jasper.project.euler.utils.Resources;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution to Project Euler problem 54.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=54">http://projecteuler.net/problem=54</a>
 */
public class Problem054 implements Solvable {
    /**
     * {@inheritDoc}
     */
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

    /**
     * Read the text file with poker games.
     *
     * @return the poker games
     */
    private List<Game> readGames() {
        return Resources.readLines(Problem054.class, "Problem054-poker.txt").stream()
                .map(this::parseGame)
                .toList();
    }

    /**
     * Parse a game line.
     * <p/>
     * Here's an example of a line: 8C TS KC 9H 4S 7D 2S 5D 3S AC
     * This string contains 10 cards delimited by spaces,
     * where the first 5 are for Player 1 and the last 5 for Player 2.
     *
     * @param gameLine the unparsed line
     * @return the parsed game
     */
    private Game parseGame(String gameLine) {
        String[] unparsedCards = gameLine.split(" ");
        List<Card> cards = parseCards(unparsedCards);
        return new Game(cards.subList(0, 5), cards.subList(5, 10));
    }

    /**
     * Parse the cards.
     *
     * @param unparsedCards the unparsed cards
     * @return the parsed cards
     */
    private List<Card> parseCards(String[] unparsedCards) {
        List<Card> cards = new ArrayList<>(10);

        for (String cardCode : unparsedCards) {
            Card card = new Card(cardCode);
            cards.add(card);
        }

        return cards;
    }
}
