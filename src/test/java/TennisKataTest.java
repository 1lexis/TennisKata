import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisKataTest {


    @Test
    public void should_return_love_all_when_starting_game() {
        Game game = new Game(new Player("Roger Federer"), new Player("Raphael Nadal"));
        Assertions.assertEquals("Love all", game.getScore());
    }


    public class Game {

        private final Player PlayerOne;
        private final Player PlayerTwo;

        public Game(Player playerOne, Player playerTwo) {
            PlayerOne = playerOne;
            PlayerTwo = playerTwo;
        }

        public Player getPlayerOne() {
            return PlayerOne;
        }

        public Player getPlayerTwo() {
            return PlayerTwo;
        }

        public String getScore() {
            return "Love all";
        }
    }

    public class Player {

        private final String name;
        private int score = 0;

        public Player(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void winPoint() {
            score = +1;
        }
    }

}
