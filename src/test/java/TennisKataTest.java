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
        game.getServer().winPoint();
        assertThat(game.getScore()).isEqualTo("Fifteen Love");
    }

    @Test
    public void should_return_thirty_love_when_server_win_two_points() {
        Game game = createGame();
        game.getServer().winPoint();
        game.getServer().winPoint();
        assertThat(game.getScore()).isEqualTo("Thirty Love");
    }

    @Test
    public void should_return_forty_love_when_server_win_three_points() {
        Game game = createGame();
        game.getServer().winPoint();
        game.getServer().winPoint();
        game.getServer().winPoint();
        assertThat(game.getScore()).isEqualTo("Forty Love");
    }

    @Test
    public void should_return_forty_love_when_server_win_for_points() {
        Game game = createGame();
        game.getServer().winPoint();
        game.getServer().winPoint();
        game.getServer().winPoint();
        game.getServer().winPoint();
        assertThat(game.getScore()).isEqualTo("Game Roger Federer");
    }

    private Game createGame() {
        return new Game(new Player("Roger Federer"), new Player("Raphael Nadal"));
    }

}
