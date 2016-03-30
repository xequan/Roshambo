package main.business;

import java.util.Random;

/**
 * Created by DM53848 on 3/29/2016.
 */
public class Lisa extends Player {

    @Override
    public void generateRoshambo() {

        Random rand = new Random();

        int randomNum = rand.nextInt(3) + 1;

        if(randomNum == 1) {
           this.roshamboValue = Roshambo.PAPER.toString();
        }  else if (randomNum == 2) {
            this.roshamboValue = Roshambo.ROCK.toString();
        } else if (randomNum == 3) {
            this.roshamboValue = Roshambo.SCISSORS.toString();
        }
    }


}
