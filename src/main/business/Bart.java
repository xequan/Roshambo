package main.business;

/**
 * Created by DM53848 on 3/29/2016.
 */
public class Bart extends Player {

    public Bart() {
        this.playerName = "Bart";
    }

    @Override
    public void generateRoshambo() {
        this.roshamboValue = Roshambo.ROCK.toString();
    }
}
