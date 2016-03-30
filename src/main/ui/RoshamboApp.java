package main.ui;

import main.business.*;

/**
 * Created by DM53848 on 3/15/2016.
 */
public class RoshamboApp {
    public static void main(String[] args) {

        RoshamboConsole gameConsole = new RoshamboConsole();
        Player player;
        Player opponent;
        String continueString;
        String chooseOpponent;
        String choosePlayerMove;
        String choosePlayerName;
        String[] validChoices = {"r", "p", "s"};

        gameConsole.print("Welcome to the game of Roshambo\n");

        choosePlayerName = gameConsole.getRequiredString("Enter your name:");
        player = new Player1();
        player.setPlayerName(choosePlayerName);

        chooseOpponent = gameConsole.getChoiceString("Would you like to play Bart or Lisa? (b/l):", "b", "l");

        if (chooseOpponent.equalsIgnoreCase("l")) {
            opponent = new Lisa();
            opponent.setPlayerName("Lisa");
        } else {
            opponent = new Bart();
            opponent.setPlayerName("Bart");
        }


        do {

            choosePlayerMove = gameConsole.getChoiceArray("Rock, paper, or scissors? (r/p/s):", validChoices);
            player.setRoshamboValue(choosePlayerMove);
            opponent.generateRoshambo();
            gameConsole.println(player.getPlayerName() + ":" + player.getRoshamboValue() + "\n" +
                    opponent.getPlayerName() + ":" + opponent.getRoshamboValue());
            getWinner(player, opponent, gameConsole);
            continueString = gameConsole.getChoiceString("Play Again? (y/n): ", "y", "n");
        } while (continueString.equalsIgnoreCase("y"));

        gameConsole.println(player.getPlayerName() + ": " + player.getScore() + "\n" +
                opponent.getPlayerName() + ": " + opponent.getScore());

        gameConsole.close();
    }

    public static void getWinner(Player player, Player opponent, RoshamboConsole gameConsole){
        if (player.getRoshamboValue().equalsIgnoreCase(opponent.getRoshamboValue())){
            gameConsole.println("Draw!");
        } else if (player.getRoshamboValue().equalsIgnoreCase(Roshambo.ROCK.toString()) &&
                opponent.getRoshamboValue().equalsIgnoreCase(Roshambo.SCISSORS.toString())) {
            gameConsole.println(player.getPlayerName() + " wins");
            player.incrementScore();
        } else if (player.getRoshamboValue().equalsIgnoreCase(Roshambo.ROCK.toString()) &&
                opponent.getRoshamboValue().equalsIgnoreCase(Roshambo.PAPER.toString())) {
            gameConsole.println(opponent.getPlayerName() + " wins");
            opponent.incrementScore();
        } else if (player.getRoshamboValue().equalsIgnoreCase(Roshambo.PAPER.toString()) &&
                opponent.getRoshamboValue().equalsIgnoreCase(Roshambo.SCISSORS.toString())) {
            gameConsole.println(opponent.getPlayerName() + " wins");
            opponent.incrementScore();
        } else if (player.getRoshamboValue().equalsIgnoreCase(Roshambo.PAPER.toString()) &&
                opponent.getRoshamboValue().equalsIgnoreCase(Roshambo.ROCK.toString())) {
            gameConsole.println(player.getPlayerName() + " wins");
            player.incrementScore();
        } else if (player.getRoshamboValue().equalsIgnoreCase(Roshambo.SCISSORS.toString()) &&
                opponent.getRoshamboValue().equalsIgnoreCase(Roshambo.PAPER.toString())) {
            gameConsole.println(player.getPlayerName() + " wins");
            player.incrementScore();
        } else if (player.getRoshamboValue().equalsIgnoreCase(Roshambo.SCISSORS.toString()) &&
                opponent.getRoshamboValue().equalsIgnoreCase(Roshambo.ROCK.toString())) {
            gameConsole.println(opponent.getPlayerName() + " wins");
            opponent.incrementScore();
        }

    }
}
