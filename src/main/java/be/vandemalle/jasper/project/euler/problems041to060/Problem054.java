package be.vandemalle.jasper.project.euler.problems041to060;

import be.vandemalle.jasper.project.euler.AbstractProblemTester;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Card;
import be.vandemalle.jasper.project.euler.problems041to060.poker.Game;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Solution to Project Euler problem 54.
 *
 * @author Jasper Vandemalle
 * @see <a href="http://projecteuler.net/problem=54">http://projecteuler.net/problem=54</a>
 */
public class Problem054 extends AbstractProblemTester {
    /**
     * The Constant ANSWER.
     */
    private static final String ANSWER = "42";

    /**
     * The Constant FILENAME.
     */
    private static final String FILENAME = "src/main/resources/be/vandemalle/jasper/project/euler/problems041to060/Problem054-poker.txt";

    /**
     * {@inheritDoc}
     */
    @Override
    public String solve() {
        List<Game> games = readGames();
        int player1HandsWon = 0;

        for (Game game : games) {
            game.play();

            System.out.println(game);
            System.out.println();

            if (game.isPlayer1Winner()) {
                player1HandsWon++;
            }
        }

        return Integer.toString(player1HandsWon);
    }

    private List<Game> readGames() {
        File file = new File(FILENAME);
        List<Game> games = new ArrayList<>(1_000);

        try (Stream<String> gameLines = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            for (String gameLine : (Iterable<String>) gameLines::iterator) {
                Game game = parseGame(gameLine);
                games.add(game);
            }
        } catch (IOException e) {
            return games;
        }

        return games;
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

    private List<Card> parseCards(String[] unparsedCards) {
        List<Card> cards = new ArrayList<>(10);

        for (String cardCode : unparsedCards) {
            Card card = new Card(cardCode);
            cards.add(card);
        }

        return cards;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAnswer() {
        return ANSWER;
    }
}
