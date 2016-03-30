package main.business;

/**
 * Created by DM53848 on 3/29/2016.
 */
public enum Roshambo {
    ROCK,
    SCISSORS,
    PAPER;

    @Override
    public String toString() {
        String returnString = "";
        if (ordinal() == 0) {
            returnString = "Rock";
        } else if (ordinal() == 1) {
            returnString = "Scissors";
        } else if (ordinal() == 2) {
            returnString = "Paper";
        }
        return returnString;
    }
}
