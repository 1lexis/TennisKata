import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTestSteps {

    private Game game;

    @Given("^The game begin against \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_game_begin(String server, String receveir) {
        game = new Game(new Player(server), new Player(receveir));
    }

    @When("^Server score (\\d+) points")
    public void server_score_x_points(int points) {
        for (int i = 1; i <= points; i++) {
            game.getServer().winPoint();
        }
    }

    @When("^Receveir score (\\d+) points")
    public void receveir_score_x_points(int points) {
        for (int i = 1; i <= points; i++) {
            game.getReceiver().winPoint();
        }
    }

    @Then("^Score should be \"([^\"]*)\"$")
    public void score_should_be(String expectedScore) {
        assertThat(game.getScore()).isEqualTo(expectedScore);
    }

}
