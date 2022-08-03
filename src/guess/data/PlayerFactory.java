package src.guess.data;

import java.util.ArrayList;
import java.util.Objects;

public class PlayerFactory {

    public String[] players;

    public static ArrayList<Player> make(String... players) {

        ArrayList<Player> list = new ArrayList<Player>();
        for (String player: players) {
            list.add(generate(player));
        }
        return list;
    }

    private static Player generate(String name)
    {
        if (Objects.equals(name, "HUMAN"))
        {
            return (new HumanPLayer("name"));
        }

        return (new RobotPLayer("robot"));
    }
}
