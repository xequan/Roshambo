package main.business;

/**
 * Created by DM53848 on 3/29/2016.
 */
public abstract class Player {
    String playerName;
    String roshamboValue;
    int score = 0;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRoshamboValue() {
        return this.roshamboValue;
    }

    public void setRoshamboValue(String move) {
        if (move.equalsIgnoreCase("s")){
            this.roshamboValue = Roshambo.SCISSORS.toString();
        } else if (move.equalsIgnoreCase("r")) {
            this.roshamboValue = Roshambo.ROCK.toString();
        } else if (move.equalsIgnoreCase("p")) {
            this.roshamboValue = Roshambo.PAPER.toString();
        }
    }

    public void incrementScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }

    public abstract void generateRoshambo();
}
