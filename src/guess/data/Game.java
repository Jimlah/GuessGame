package src.guess.data;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {

    public Game(ArrayList<Player> players)
    {
        System.out.println(Arrays.toString(players.toArray()));
    }

    public boolean start()
    {
        return true;
    }

    public boolean stop()
    {
        return true;
    }
}


