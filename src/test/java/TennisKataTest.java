import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisKataTest {

    @Test
    public void should_return_love_all_when_starting_game() {
        Game game = createGame();
        assertThat(game.getScore()).isEqualTo("Love all");
    }

    @Test
    public void should_return_fifteen_love_when_server_win_one_point() {
        Game game = createGame();
        incrementScore(game.getServer(), 1);
        assertThat(game.getScore()).isEqualTo("Fifteen Love");
    }

    @Test
    public void should_return_fifteen_all_when_server_and_receveir_win_one_point() {
        Game game = createGame();
        incrementScore(game.getServer(), 1);
        incrementScore(game.getReceiver(), 1);
        assertThat(game.getScore()).isEqualTo("Fifteen all");
    }

    @Test
    public void should_return_thirty_all_when_server_win_two_points() {
        Game game = createGame();
        incrementScore(game.getServer(), 2);
        assertThat(game.getScore()).isEqualTo("Thirty Love");
    }

    @Test
    public void should_return_thirty_all_when_server_and_receveir_win_two_points() {
        Game game = createGame();
        incrementScore(game.getServer(), 2);
        incrementScore(game.getReceiver(), 2);
        assertThat(game.getScore()).isEqualTo("Thirty all");
    }

    @Test
    public void should_return_forty_love_when_server_win_three_points() {
        Game game = createGame();
        incrementScore(game.getServer(), 3);
        assertThat(game.getScore()).isEqualTo("Forty Love");
    }

    @Test
    public void should_return_forty_love_when_server_and_receveir_win_three_points() {
        Game game = createGame();
        incrementScore(game.getServer(), 3);
        incrementScore(game.getReceiver(), 3);
        assertThat(game.getScore()).isEqualTo("Forty all");
    }

    @Test
    public void should_return_forty_love_when_server_win_four_points() {
        Game game = createGame();
        incrementScore(game.getServer(), 4);
        assertThat(game.getScore()).isEqualTo("Game Roger Federer");
    }

    private Game createGame() {
        return new Game(new Player("Roger Federer"), new Player("Raphael Nadal"));
    }

    private void incrementScore(Player player, int pointsWin) {
        for (int i = 1; i <= pointsWin; i++) {
            player.winPoint();
        }
    }

}
