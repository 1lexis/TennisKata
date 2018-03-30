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
        score = score + 1;
    }
}
