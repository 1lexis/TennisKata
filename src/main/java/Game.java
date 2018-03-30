import java.util.HashMap;
import java.util.Map;

public class Game {

    private static final Map<Integer, String> SCORE_DICTIONNAY = new HashMap<>();

    static {
        SCORE_DICTIONNAY.put(0, "Love");
        SCORE_DICTIONNAY.put(1, "Fifteen");
        SCORE_DICTIONNAY.put(2, "Thirty");
        SCORE_DICTIONNAY.put(3, "Forty");
    }

    private final Player server;
    private final Player receiver;

    public Game(Player server, Player receiver) {
        this.server = server;
        this.receiver = receiver;
    }

    public Player getServer() {
        return server;
    }

    public Player getReceiver() {
        return receiver;
    }

    public String getScore() {
        if (server.getScore() == 4 && receiver.getScore() < 4) {
            return "Game " + server.getName();
        } else if (server.getScore() == receiver.getScore() && server.getScore() >= 4) {
            return "Deuce";
        } else if (server.getScore() == receiver.getScore()) {
            return scoreToString(server.getScore()) + " all";
        } else if (server.getScore() >= 4) {
            return "Advantage " + (server.getScore() > receiver.getScore() ? "in" : "out");
        } else {
            return scoreToString(server.getScore()) + " " + scoreToString(receiver.getScore());
        }
    }

    private String scoreToString(int score) {
        return SCORE_DICTIONNAY.get(score);
    }

}
