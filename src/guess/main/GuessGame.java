package src.guess.main;

import src.guess.data.Player;
import src.guess.data.PlayerFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class GuessGame {

    public static void main(String[] args) {
        ArrayList<Player> factory = PlayerFactory.make("human", "robot");
//       src.guess.data.Game game =  new src.guess.data.Game(src.guess.data.PlayerFactory.make("human", "robot"));
//        game.start();
        System.out.println(Arrays.toString(factory.toArray()));
    }
}

