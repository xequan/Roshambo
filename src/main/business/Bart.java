package main.business;

/**
 * Created by DM53848 on 3/29/2016.
 */
public class Bart extends Player {

    @Override
    public void generateRoshambo() {
        this.roshamboValue = Roshambo.ROCK.toString();
    }
}
